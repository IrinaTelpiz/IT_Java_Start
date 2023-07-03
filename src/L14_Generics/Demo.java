package L14_Generics;

import L11_Collections.Book;
import L8_Inheritance.Triangle;

public class Demo {
    public static void main(String[] args) {

        Gen<Triangle> iOb;



        Book myBook = new Book("Author", "MyBook");

        Triangle myTriangle = new Triangle();

        iOb = new Gen<>(myTriangle);

        iOb.showType();

    }
}
