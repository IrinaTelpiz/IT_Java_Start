package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina;

class TruckDemo {
    public static void main(String[] args) {

        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);

        System.out.println("Track can carry " + semi.getCargoCap() + " pounds.");
        System.out.println("To cover " + dist + " miles truck needs " + gallons + " of fuel.\n");

        gallons = pickup.fuelNeeded(dist);

        System.out.println("Track can carry " + pickup.getCargoCap() + " pounds.");
        System.out.println("To cover " + dist + " miles pickup needs " + gallons + " of fuel.");
    }
}
