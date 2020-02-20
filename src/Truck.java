public class Truck extends Car {
    private double loadWeight;
    private double combustionWithLoad = 0.5;
    private double combustionWithAC = 1.6;


    public Truck(String name, double tankCapacity, double combustion, boolean airConditioning, double loadWeight) {
        super(name, tankCapacity, combustion, airConditioning);
        this.loadWeight = loadWeight;
    }

    @Override
    public double totalCombustionAt100Km() {
        if (isAirConditioning()) {
            return (getCombustion() + combustionWithAC + (((int) (loadWeight / 100) * combustionWithLoad)));
        } else {
            return (getCombustion() + (((int) (loadWeight / 100) * combustionWithLoad)));
        }
    }

    @Override
    public double vehicleRange() {
        return getTankCapacity() / totalCombustionAt100Km() * 100;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Load weight: " + loadWeight + "kg");
    }
}
