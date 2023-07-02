package L11_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, Book> library = new HashMap<>();

        Book a = new Book("Stiven King", "IT", (short) 1985,Book.Genre.HORROR);
        Book b = new Book("Michail Bulgakov", "Master and Margarita", (short) 1965, Book.Genre.ROMANCE);
        Book b1 = new Book("Michail Bulgakov", "Master and Margarita", (short) 1965, Book.Genre.ROMANCE);
        Book c = new Book("Walter Scott", "Memuares", (short) 1806,Book.Genre.ROMANCE);
        Book d = new Book("Charles Dickenson", "Oliver Twist", (short) 1726);
        Book e = new Book("Alexandre Dumas", "Three Musketeers", (short) 1988);
        Book f = new Book("Edgar Alan Poo", "Golden bug", (short) 1777, Book.Genre.DETECTIVE);
        Book g = new Book("Unknown", "Mistery");

        List<Book> list = Arrays.asList(a,b,b1,c,d,e,f,g);

        library.put(1,d);

        library =  convertListToMap(list);

        System.out.println(library);
    }

    private static HashMap<Integer, Book> convertListToMap(List<Book> list) {
        HashMap<Integer, Book> hashMap = new HashMap<>();
        for (int i = 0; i < list.size();i++){
            hashMap.put(1000+i, list.get(i));
        }
        return hashMap;
    }
}
