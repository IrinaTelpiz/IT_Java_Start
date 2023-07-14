package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina;

import Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QPack.*;

class IQDemo {

    public static void main(String[] args) {

        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;

        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        System.out.print("Fixed Queue content: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;

        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        System.out.print("Dynamic Queue content: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;

        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        System.out.print("Circular Queue content: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        for (i = 10; i < 20; i++) {
            iQ.put((char) ('A' + i));
        }

        System.out.print("Circular Queue content: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        q3.reset();

//        for (i = 10; i < 20; i++) {
//            iQ.put((char) ('A' + i));
//        }

        System.out.print("Circular Queue content after RESET: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }


        System.out.println("\nSaving and using Circular Queue data.");
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }


    }
}





