package constructor;

public class Main {
    public static void main(String[] args) {

        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.myMethod();

       ElectricVehicle electricVehiclepara = new ElectricVehicle( "Tesla",12345L);
       System.out.println(electricVehiclepara.vin);
       System.out.println(electricVehiclepara.brand);

    }
}