package constructor;

public class ElectricVehicle {
    String brand;
    Long vin;



    public ElectricVehicle() {
        System.out.println("I am called when object is created ");
    }

    public ElectricVehicle(String brand, Long vin) {
        this.brand = brand;
        this.vin = vin;
        System.out.println("I am called when object is created ");

    }
    public void myMethod() {
        System.out.println("This is my method");
    }
}
