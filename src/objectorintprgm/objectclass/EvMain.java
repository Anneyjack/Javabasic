package objectorintprgm.objectclass;

public class EvMain {
    public static void main(String[] args) {

        EletricVehicle electricVehicle = new EletricVehicle();
        EletricVehicle electricVehicle2 = new EletricVehicle();

        electricVehicle.brand = "Kia";
        electricVehicle.vin = 12345;

        electricVehicle2.brand = "Tesla";
        electricVehicle2.vin = 2341;

        electricVehicle.printBrand();
        electricVehicle.printVin();

        electricVehicle2.printBrand();
        electricVehicle2.printVin();

    }

}
