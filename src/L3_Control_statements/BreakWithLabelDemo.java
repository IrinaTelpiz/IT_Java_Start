package L3_Control_statements;

public class BreakWithLabelDemo {
    public static void main(String[] args) {

        int i;

        for (i = 1;i < 4; i++){
            one:{
            two:{
            three:{
                System.out.println("\n i is equal: " +i);
                if (i==1) break one;
                if (i==2) break two;
                if (i==3) break three;

                System.out.println("this wont be printed");
            }
                System.out.println("after code block three");
            }
                System.out.println("after code block two");
            }
                System.out.println("after code block one");
        }
    }
}
