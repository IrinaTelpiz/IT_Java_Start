package L9_Interfaces;

public class IQDemo {
    public static void main(String[] args) {
        FixedQue fixedQue = new FixedQue(10);
        int i;
        for (i = 0; i < 10; i++)
            fixedQue.put((char)('A' + i));

        for (i = 0; i < 10; i++)
            System.out.print(fixedQue.get());
        System.out.println();

        for (i = 0; i < 20; i++)
            fixedQue.put((char)('A' + i));

        for (i = 0; i < 20; i++)
            System.out.print(fixedQue.get());
        System.out.println();
    }



}
