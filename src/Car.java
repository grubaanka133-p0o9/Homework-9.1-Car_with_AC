public class Car extends Vehicle {
    private boolean airConditioning;
    private double combustionWithAC = 0.8;

    public Car(String name, double tankCapacity, double combustion, boolean airConditioning) {
        super(name, tankCapacity, combustion);
        this.airConditioning = airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    @Override
    public double totalCombustionAt100Km() {
        if (airConditioning) {
            return getCombustion() + combustionWithAC;
        } else {
            return getCombustion();
        }
    }

    @Override
    public void setAC(boolean ac) {
        this.airConditioning = ac;
    }

    @Override
    public double vehicleRange() {
        return getTankCapacity() / totalCombustionAt100Km() *100;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Air conditioning: " + airConditioning + "\nTotal combustion: "
                + totalCombustionAt100Km() + "L");
    }
}
