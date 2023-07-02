package L3_Control_statements;

import java.util.Scanner;

public class ExceptingOrDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Is the product on 50% discount?");
        boolean isDiscounted = in.nextBoolean();

        System.out.println("Do you have 20% discount card?");
        boolean hasCard = in.nextBoolean();

        System.out.println("Enter product price:");
        double initialPrice = in.nextDouble();
        double finalPrice;

        if (isDiscounted ^ hasCard) {
            System.out.println("You will have the discount. Let's see which one.");
            if (isDiscounted) finalPrice = initialPrice / 2;
            else finalPrice = initialPrice * 0.8;
        } else {
            if (isDiscounted){
            System.out.println("WARNING! You cannot apply the discount to already discounted product. You have card but it is not applicable.");
            finalPrice = initialPrice / 2;
            } else {
                System.out.println("Neither the product is discounted or you don't have discount card, so pay full initial price");
                finalPrice = initialPrice;
            }
        }
        System.out.println("The discount has been applied. The final product price is: " + finalPrice);

//        boolean one = true;
//        boolean two = true;
//        boolean three = false;

//        if (one ^ two ^ three) {
//            System.out.println("Returns TRUE");
//        } else {
//            System.out.println("Returns FALSE");
//        }

    }
}



