package Homeworks.L1HW_Java_Telpiz_Irina;

public class Sound {
    public static void main(String[] args) {

        double dist, timeSecondsPast;
        int speedMetersInSeconds = 340;

        timeSecondsPast = 7.87;
        dist = (timeSecondsPast * speedMetersInSeconds) / 2;

        System.out.println("Distance from you to the object is " + dist + " meters.");
    }
}
