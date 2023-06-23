package L5_Classes;

public class MyClassDemo {
    public static void main(String[] args) {
        MyClass myClassVariable;
        MyClass myClassVariable1;

        myClassVariable = new MyClass(7);
        myClassVariable1 = new MyClass(78);

        System.out.println(myClassVariable.x);
        System.out.println(myClassVariable1.x);
    }
}
