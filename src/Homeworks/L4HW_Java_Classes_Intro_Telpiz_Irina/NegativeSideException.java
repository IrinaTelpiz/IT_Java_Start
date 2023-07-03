package Homeworks.L4HW_Java_Classes_Intro_Telpiz_Irina;

public class NegativeSideException {

    int n;

    NegativeSideException(int num){
        n = num;
    }

    @Override
    public String toString() {
        return "NegativeSideException: " + n + " is negative and cannot be set as side.";
    }
}
