package L4_Methods;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle minivan;
        minivan = new Vehicle(7,16,21);
        Vehicle sportcar = new Vehicle(2,14, 12);
        Vehicle randomVehicle = new Vehicle();

        sportcar.printRange("Sportcar");

        minivan.printRange("Minivan");

        System.out.println("Just range for minivan: " + minivan.calculateRange());

        sportcar.seatsInTheVehicle("Sportcar");
        minivan.seatsInTheVehicle("Minivan");

        Vehicle.myMethod();

        System.out.println("Sportcar needs the following volume of fuel " +
                "to go at the distance of 1000 miles: " + sportcar.calculateFuelVolume(252));
        System.out.println("Minivan needs the following volume of fuel " +
                "to go at the distance of 1000 miles: " + minivan.calculateFuelVolume(252));
    }
}
