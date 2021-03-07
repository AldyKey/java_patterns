package factory;

public class RoadLogistics {
    public Transport createTransport(String typeof) {
        return new Truck();
    }
}
