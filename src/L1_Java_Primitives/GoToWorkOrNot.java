package L1_Java_Primitives;

import java.util.Scanner;

public class GoToWorkOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Today is weekday? Answer true or false.");
        boolean isWeekday = input.nextBoolean();
        System.out.println("Today is holiday? Answer true or false.");
        boolean isHoliday = input.nextBoolean();

        if (isWeekday & isHoliday) System.out.println("Its not weekend but you can stay at home, because its holiday.");
        if (!isWeekday | isHoliday) System.out.println("Its weekend or holiday, so stay at home.");
        if (isWeekday & !isHoliday) System.out.println("Its weekday and not holiday, so go to the work.");
    }
}
