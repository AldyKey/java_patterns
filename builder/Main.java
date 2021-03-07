package builder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder hb = new HouseBuilder.Builder().buildWalls(4).buildDoors(2).buildWindows(4).buildRoof("yes").buildGarage("yes").getResult();

        System.out.println(hb.getWalls());
        System.out.println(hb.getDoors());
        System.out.println(hb.getWindows());
        System.out.println(hb.getRoof());
        System.out.println(hb.getGarage());

    }
}
