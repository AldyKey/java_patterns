package factory;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by Ship!");
    }
}
