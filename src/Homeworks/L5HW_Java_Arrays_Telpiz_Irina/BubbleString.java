package Homeworks.L5HW_Java_Arrays_Telpiz_Irina;

public class BubbleString {
    public static void main(String[] args) {

        String strings[] = {"Sam", "Karl", "Nick", "Oliver", "Ben", "Mary", "Anne", "Paul", "Jack"};
        int a, b;
        String t;

        System.out.print("INITIAL Array of Strings: ");

        for (int i = 0; i < strings.length; i++) System.out.print(" " + strings[i]);
        System.out.println();

        for (a = 1; a < strings.length; a++)
            for (b = strings.length - 1; b >= a; b--){
                if (strings[b-1].compareTo(strings[b])>0){
                        t = strings[b-1];
                        strings[b-1] = strings[b];
                        strings[b] = t;
                }
            }
        System.out.print("SORTED Array of Strings: ");
        for (int i = 0; i < strings.length; i++) System.out.print(" " + strings[i]);
        System.out.println();
    }
}
