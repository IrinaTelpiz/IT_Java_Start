package L5_Classes;

public class AccessDemo {

    public static void main(String[] args) {

        MyClassAlpha obj = new MyClassAlpha();
        obj.setAlpha(6);
        obj.beta = 10000;
        System.out.println(obj.getAlpha());
    }
}
