package L11_Collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Book> library = new LinkedList<>();

        Book a = new Book("Stiven King", "IT", (short) 1985);
        Book b = new Book("Michail Bulgakov", "Master and Margarita", (short) 1965);
        Book c = new Book("Walter Scott", "Memuares", (short) 1806);
        Book d = new Book("Charles Dickenson", "Oliver Twist", (short) 1726);
        Book e = new Book("Alexandre Dumas", "Three Musketeers", (short) 1988);
        Book f = new Book("Edgar Alan Poo", "Golden bug", (short) 1777);
        Book g = new Book("Unknown", "Mistery");

        List<Book> list = Arrays.asList(a,b,b,b,c,d,e,b,f,g);
        library.addAll(list);
//        library.removeFirst();
//        library.removeLast();
//        library.removeLastOccurrence(b);

        library.offerFirst(a);
        library.offerLast(a);

        Iterator<Book> it = library.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
