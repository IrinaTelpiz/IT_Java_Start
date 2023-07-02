package L11_Collections;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

//        Comparator<BookNonCompareble> severityComparator = Comparator.comparing(Patient::get);

        Queue<Book> library = new PriorityQueue<>() {
        };
        Book a = new Book("Stiven King", "IT", (short) 1985);
        Book b = new Book("Michail Bulgakov", "Master and Margarita", (short) 1965);
        Book c = new Book("Walter Scott", "Memuares", (short) 1806);
        Book d = new Book("Charles Dickenson", "Oliver Twist", (short) 1726);
        Book e = new Book("Alexandre Dumas", "Three Musketeers", (short) 1988);
        Book f = new Book("Edgar Alan Poo", "Golden bug", (short) 1777);
        Book g = new Book("Unknown", "Mystery",(short) 254);

        List<Book> list = Arrays.asList(a,b,c,d,e,f,g);

        library.addAll(list);

        System.out.println(library.peek());

        Patient newPatient0 = new Patient("John", 45,(byte) 3);
        Patient newPatient1 = new Patient("Anna", 33,(byte) 1);
//        Patient newPatient2 = new Patient();
//        Patient newPatient3 = new Patient();

        List<Patient> listOfPatients = Arrays.asList(newPatient0,newPatient1);

        Queue<Patient> hospitalQueue = new PriorityQueue<Patient>(listOfPatients);
        hospitalQueue.addAll(listOfPatients);

        System.out.println(hospitalQueue.peek());



    }
}
