package L11_Collections;

import java.util.HashMap;

public class HashMapEasy {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington");
        System.out.println(capitalCities);

        System.out.println( capitalCities.get("England"));
        capitalCities.remove("England");

        System.out.println(capitalCities);
//        capitalCities.clear();
        capitalCities.size();

        System.out.println("\nKeys:");

        for (String i : capitalCities.values()){
            System.out.println("key value: " + i);
        }

        System.out.println("\nKeys value:");

        for (String i : capitalCities.keySet()){
            System.out.println("key: " + i);
        }

        System.out.println("\nKeys and values:");

        for (String i : capitalCities.keySet()){
            System.out.println("key: " + i + "; value: " + capitalCities.get(i));
        }


    }
}
