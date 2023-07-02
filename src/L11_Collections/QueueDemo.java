package L11_Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class QueueDemo {
    public static void main(String[] args) {

        FixedSizeLinkedList<Book> library = new FixedSizeLinkedList<>(5);

        Book a = new Book("Stiven King", "IT", (short) 1985);
        Book b = new Book("Michail Bulgakov", "Master and Margarita", (short) 1965);
        Book c = new Book("Walter Scott", "Memuares", (short) 1806);
        Book d = new Book("Charles Dickenson", "Oliver Twist", (short) 1726);
        Book e = new Book("Alexandre Dumas", "Three Musketeers", (short) 1988);
        Book f = new Book("Edgar Alan Poo", "Golden bug", (short) 1777);
        Book g = new Book("Unknown", "Mistery");

        List<Book> list = Arrays.asList(a,b,b,b,c,d,e,f,b,g);
        library.addAll(list);
//        library.removeFirst();
//        library.removeLast();

        library.removeLastOccurrence(b);

        System.out.println(library.offerFirst(a));
        library.offerLast(library.offerLast(a));


        Iterator<Book> it = library.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
