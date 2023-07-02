package L11_Collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

       ArrayList<Book> library = new ArrayList<Book>();
       Book a = new Book("Stiven King", "IT", (short) 1985);
       Book b = new Book("Michail Bulgakov", "Master and Margarita", (short) 1965);
       Book c = new Book("Walter Scott", "Memuares", (short) 1806);
       Book d = new Book("Charles Dickenson", "Oliver Twist", (short) 1726);
       Book e = new Book("Alexandre Dumas", "Three Musketeers", (short) 1988);
       Book f = new Book("Edgar Alan Poo", "Golden bug", (short) 1777);
       Book g = new Book("Unknown", "Mistery",(short) 253);

        List<Book> list = Arrays.asList(a,b,c,d,e,f,g);

       library.add(b);
       library.add(b);
       library.add(c);
        System.out.println(library.get(0));
        System.out.println(library.size());
        library.remove(b);
        System.out.println(library.size());
        library.remove(0);
        System.out.println(library.size());
        System.out.println(library.contains(c));
        System.out.println(library.containsAll(list));
        library.addAll(list);
        library.remove(c);
        System.out.println(library.containsAll(list));
//        System.out.println(library);



//        Iterator<Book> it = library.iterator();
//        while (it.hasNext()){
//            Book i = it.next();
//            if (i.getYearOfEdition() < 1900){
//                it.remove();
//            }
//        }
//
//        Scanner input = new Scanner(System.in);
//        for ( char i = ' '; i != 'q';){
//            System.out.println("Enter book name: ");
//            String name = input.nextLine();
//            library.add(new Book(name));
//            System.out.println("Do you want to continue? Enter smth if Yes. Enter 'q' if not.");
//            i = input.nextLine().charAt(0);
//        }

        for (Book item: library){
            System.out.println(item);
        }

        Comparator<Book> nameComparator = Comparator.comparing(Book::getName);
        Comparator<Book> ageComparator = Comparator.comparing(Book::getAge);
        Comparator<Book> yearEditionComparator = Comparator.comparing(Book::getYearOfEdition);
        Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);

        library.sort(yearEditionComparator);

        System.out.println("\nSORTED BY YEAR OF EDITION: \n");

        for (Book item: library){
            System.out.println(item);
        }

        library.sort(authorComparator);

        System.out.println("\nSORTED BY AUTHOR OF THE BOOK: \n");

        for (Book item: library){
            System.out.println(item);
        }
    }
}
