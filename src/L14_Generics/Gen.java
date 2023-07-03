package L_14_Generics;

public class Gen<T>{

    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type T - is " + ob.getClass().getName());
    }
}
