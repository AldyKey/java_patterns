package factory;

public class Logistics {
    public static void main(String[] args) {
        RoadLogistics rl = new RoadLogistics();
        SeaLogistics sl = new SeaLogistics();
        Transport truck = rl.createTransport("Truck");
        Transport ship = sl.createTransport("Ship");
        truck.deliver();
        ship.deliver();
    }
}
