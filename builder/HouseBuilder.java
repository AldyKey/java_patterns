package builder;

public class HouseBuilder {
    private int walls;
    private int doors;
    private int windows;
    private String roof;
    private String garage;


    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public String getRoof() {
        return roof;
    }

    public String getGarage() {
        return garage;
    }

    private HouseBuilder(Builder builder) {
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.roof = builder.roof;
        this.garage = builder.garage;
    }

    static class Builder {
        private int walls;
        private int doors;
        private int windows;
        private String roof;
        private String garage;

        public Builder buildWalls(int walls) {
            this.walls = walls;
            return this;
        }

        public Builder buildDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder buildWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder buildGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public HouseBuilder getResult() {
            return new HouseBuilder(this);
        }
    }
}
