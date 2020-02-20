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

    public double getTankCapacity() {
        return tankCapacity;
    }
    public void setAC (boolean ac){

    }

    public double totalCombustionAt100Km() {
        return combustion;
    }

    public double vehicleRange() {
        return tankCapacity / totalCombustionAt100Km() * 100;
    }

    public void showInfo() {
        System.out.println("Name: " + name + "\nTank capacity: " + tankCapacity + "L");
    }
}
