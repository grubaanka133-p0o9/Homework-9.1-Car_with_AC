public class Vehicle {
    private String name;
    private double tankCapacity;
    private double combustion;

    public Vehicle(String name, double tankCapacity, double combustion) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.combustion = combustion;
    }

    public double getCombustion() {
        return combustion;
    }

    public double totalCombustionAt100Km() {
        return combustion;
    }

    public double vehicleRange() {
        return vehicleRange();
    }

    public void showInfo() {
        System.out.println("Name: " + name + "\nTank capacity: " + tankCapacity + "L");
    }
}
