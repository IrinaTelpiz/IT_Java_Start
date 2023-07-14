package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QueueException;

import Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QPack.FixedQueue;

class QExcDemo {
    public static void main(String[] args) {

        FixedQueueExc q = new FixedQueueExc(10);

        char ch;
        int i;

        try{
            for (i = 0; i < 11; i++){
                System.out.print("Save attempt: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (i = 0; i < 11; i++){
                System.out.print("Getting next symbol: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc){
            System.out.println(exc);
        }
    }
}
