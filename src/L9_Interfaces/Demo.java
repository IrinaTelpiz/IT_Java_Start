package L9_Interfaces;

public class Demo {
    public static void main(String[] args) {

        ByTwos byTwos = new ByTwos();
        printFirstFive(byTwos);

        ByThrees byThrees = new ByThrees();



        printFirstFive(byThrees);
        byThrees.getNextArray(5);


//        for (int i = 0; i < 5; i++)
//            System.out.println("next value: " + byTwos.getNext());
//
//        System.out.println("\n Reset");
//        byTwos.reset();
//
//        for (int i = 0; i < 5; i++)
//            System.out.println("next value: " + byTwos.getNext());
//
//        System.out.println("\nStart value: 100");
//        byTwos.setStart(100);
//
//        for (int i = 0; i < 5; i++)
//            System.out.println("ext value: " + byTwos.getNext());
//
//        System.out.println("\ncontinue");
//        for (int i = 0; i < 5; i++)
//            System.out.println("ext value: " + byTwos.getNext());
//
//        for (int i = 0; i < 5; i++)
//            System.out.println("next value: " + byThrees.getNext());
//
//        System.out.println("\n Reset");
//        byThrees.reset();
//
//        for (int i = 0; i < 5; i++)
//            System.out.println("next value: " + byThrees.getNext());
//
//        System.out.println("\nStart value: 100");
//        byThrees.setStart(100);
//
//        for (int i = 0; i < 5; i++)
//            System.out.println("ext value: " + byThrees.getNext());
//
//        System.out.println("\ncontinue");
//        for (int i = 0; i < 5; i++)
//            System.out.println("ext value: " + byThrees.getNext());

        Series series;

//        for (int i = 0; i < 5; i++){
//            series = byTwos;
//            System.out.println("next value of byTwos: " + series.getNext());
//            series = byThrees;
//            System.out.println("next value of byThres: " + series.getNext());
//
//
//
//
//        }
    }

    public static void printFirstFive(Series mySequence){
        for (int i = 0; i < 5; i++) System.out.println("next value" + mySequence.getNext());

    }
    public static void printFirstFive(int[]arr){
        for (int i = 0; i < arr.length; i++) System.out.println("next value" + arr[i] + " ");
    }
}
