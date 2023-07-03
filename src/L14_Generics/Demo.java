package L_14_Generics;

import L11_Collections.Book;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        Gen<Book> iOb;

        Book myBook = new Book("Author", "MyBook");

        iOb = new Gen<>(myBook);

        iOb.showType();

        ArrayList<Integer> myColl;

        TwoGen<String, Book> myTwoGen = new TwoGen<>("myBook",myBook);
        myTwoGen.showType();
    }
}
