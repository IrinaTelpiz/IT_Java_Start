package Homeworks.L1HW_Java_Telpiz_Irina;

public class GalToLitTable {
    public static void main(String[] args) {

        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons are equal to " + liters + " liters");
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
