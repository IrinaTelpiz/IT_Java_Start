package L11_Collections;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {


        Book a = new Book("Stiven King", "IT", (short) 1985,Book.Genre.HORROR);
        Book b = new Book("Michail Bulgakov", "Master and Margarita", (short) 1965, Book.Genre.ROMANCE);
        Book b1 = new Book("Michail Bulgakov", "Master and Margarita", (short) 1965, Book.Genre.ROMANCE);
        Book c = new Book("Walter Scott", "Memuares", (short) 1806,Book.Genre.ROMANCE);
        Book d = new Book("Charles Dickenson", "Oliver Twist", (short) 1726);
        Book e = new Book("Alexandre Dumas", "Three Musketeers", (short) 1988);
        Book f = new Book("Edgar Alan Poo", "Golden bug", (short) 1777, Book.Genre.DETECTIVE);
        Book g = new Book("Unknown", "Mistery");

        List<Book> list = Arrays.asList(a,b,b1,c,d,e,f,g);

        HashSet<Book> library = new HashSet<>(list);
        ArrayList<Book> libraryA = new ArrayList<>(list);
        LinkedList<Book> libraryL = new LinkedList<>(list);

        for (Book myBook: library){
            System.out.println(myBook);
        }

        library.clear();
        library.add(d);
        library.addAll(list);
        library.remove(b1);

//
//        String myString1 = new String("Hello");
//        String myString2 = new String("Hello");
//
//        if (b.equals(b1)) System.out.println("strings are equal");
//        else System.out.println("strings are NOT equal");

//        int i= 0;
//        int j= 0;
//
//        if (i==j) System.out.println("integers are equal");
//        else System.out.println("integers are NOT equal");


    }
}
