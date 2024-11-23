package constructor;

public class ElectricVehical {
    String brand;
    Long vin;



    public ElectricVehical() {
        System.out.println("I am called when object is created ");
    }

    public ElectricVehical(String brand, Long vin) {
        this.brand = brand;
        this.vin = vin;
        System.out.println("I am called when object is created ");

    }
    public void myMethod() {
        System.out.println("This is my method");
    }
}
