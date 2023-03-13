class Ship {
    private String shipName;
    private String yearBuilt;

    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void print() {
        System.out.println("Ship " + shipName + " built in " + yearBuilt);
    }
}

class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String ship, String yearBuilt, int passenger) {
        super(ship, yearBuilt);
        this.maxPassengers = passenger;
    }

    public int getPassenger() {
        return maxPassengers;
    }

    public void setPassenger(int passenger) {
        this.maxPassengers = passenger;
    }

    @Override
    public void print() {
        System.out.println("Ship " + super.getShipName() + " has maximum number of " + maxPassengers + " passengers");
    }
}

class CargoShip extends Ship {
    private int cargoCapacityInTonnage;

    public CargoShip(String shipName, String yearBuilt, int cargoCapacityInTonnage) {
        super(shipName, yearBuilt);
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    public int getCargoCapacityInTonnage() {
        return cargoCapacityInTonnage;
    }

    public void setCargoCapacityInTonnage(int cargoCapacityInTonnage) {
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    @Override
    public void print() {
        System.out.println("Ship " + super.getShipName() + " has capacity of " + cargoCapacityInTonnage + " tons");
    }
}
