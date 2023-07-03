package L14_Generics;

import L8_Inheritance.TwoDShape;

public class Gen<T extends TwoDShape>{

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

    void perimeterCalc(){
        System.out.println((ob));
    }
}
