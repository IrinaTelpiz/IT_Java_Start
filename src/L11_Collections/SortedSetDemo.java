package L11_Collections;

import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        Comparator<BookNonCompareble> nameComparator = Comparator.comparing(BookNonCompareble::getName);
//        Comparator<Book> ageComparator = Comparator.comparing(Book::getAge);
        Comparator<Book> yearEditionComparator = Comparator.comparing(Book::getYearOfEdition);
        Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);

        SortedSet<BookNonCompareble> library = new TreeSet<>(nameComparator);

        BookNonCompareble a = new BookNonCompareble("Stiven King", "IT", (short) 1985);
        BookNonCompareble b = new BookNonCompareble("Michail Bulgakov", "Master and Margarita", (short) 1965);
        BookNonCompareble c = new BookNonCompareble("Walter Scott", "Memuares", (short) 1806);
        BookNonCompareble d = new BookNonCompareble("Charles Dickenson", "Oliver Twist", (short) 1726);
        BookNonCompareble e = new BookNonCompareble("Alexandre Dumas", "Three Musketeers", (short) 1988);
        BookNonCompareble f = new BookNonCompareble("Edgar Alan Poo", "Golden bug", (short) 1777);
        BookNonCompareble g = new BookNonCompareble("Unknown", "Mistery",(short) 253);

        List<BookNonCompareble> list = Arrays.asList(a,b,c,d,d,e,f,g);

        library.addAll(list);
        System.out.println(library);
    }
}
