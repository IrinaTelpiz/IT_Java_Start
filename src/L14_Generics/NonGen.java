package L_14_Generics;

import L11_Collections.Book;

public class NonGen{

    Book ob;

    NonGen(Book o){
        ob = o;
    }

    Book getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type T - is " + ob.getClass().getName());
    }
}
