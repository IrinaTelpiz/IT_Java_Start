package L14_Generics;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T ob1, V ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    void showType(){
        System.out.println("Type T - is " + ob1.getClass().getName());
        System.out.println("Type V - is " + ob2.getClass().getName());
    }
}
