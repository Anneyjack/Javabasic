package Constractor;

public class Main {
    public static void main(String[] args) {

        ElectricVehical electricVehicle = new ElectricVehical();
        electricVehicle.myMethod();

       ElectricVehical electricVehiclepara = new ElectricVehical( "Tesla",12345);
       System.out.println(electricVehiclepara.vin);
       System.out.println(electricVehiclepara.brand);

    }
}