public class VehicleArray {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Fiat", 140, 7, true);
        vehicles[1] = new Truck("Star", 230, 15, true, 380);

        vehicles[0].showInfo();
        vehicles[0].setAC(false);
        vehicles[0].showInfo();
        System.out.println();
        vehicles[1].showInfo();
        vehicles[1].setAC(false);
        vehicles[1].showInfo();
    }

}
