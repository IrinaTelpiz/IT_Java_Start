package L6_Access_Modifiers;

public class ArrDemo {
    public static void main(String[] args) {

        FailSoftArray fs = new FailSoftArray(5,-1);
        int x;
        System.out.println("Error handling without reporting:");
        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i,i*10);
        }
        for (int i = 0; i<(fs.length * 2); i++){
            x= fs.get(i);
            if (x != -1) System.out.println(x+" ");
        }
        System.out.println();

        System.out.println("\nError handling with reporting:");

        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i,i*10))
                System.out.println("Index "+i+" out of bound");
        }
        System.out.println();
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i,i*10))
                System.out.println("Index "+i+" out of bound");
        }
        System.out.println();
    }
}
