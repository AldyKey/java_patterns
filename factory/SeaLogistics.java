package factory;

public class SeaLogistics {
    public Transport createTransport(String typeof) {
        return new Ship();
    }
}
