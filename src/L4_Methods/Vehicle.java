package L4_Methods;

public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int passengersValue,int fuelcapValue, int mpgValue){
        passengers = passengersValue;
        fuelcap = fuelcapValue;
        mpg = mpgValue;
    }

    Vehicle(){}

    void printRange(String name){
        System.out.println(name + " can take "
                + passengers
                + " passengers to the distance of "
                + calculateRange() + " miles.");
    }

    int calculateRange(){
        return fuelcap * mpg;
    }

    void seatsInTheVehicle(String name){
        int i;
        for (i = 0; i < 5; i++){
            if (i == passengers) return;
            System.out.println("There is more place in " + name + " !");
        }
    }

    static void myMethod(){
        int i;
        for (i = 0; i < 10; i++){
            if (i == 5) return;
            System.out.println(i);
        }
    }

    double calculateFuelVolume(int distance) {
        return (double) distance / mpg;
    }
}
