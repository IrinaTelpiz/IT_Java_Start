package L10_Exception_Handling;

import L5_Classes_Arrays.Dog;

public class Demo {
    public static void main(String[] args) {
        int[] num = new  int[]{0,1,2,7,8};
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i+7]+" ");
        }

//        Dog myOtherDog = new Dog();
//
//        Example myEx = new Example();
//
//        System.out.println(myEx.myDog.equals(myOtherDog));
//
//        System.out.println("This will not be printed");

    }
    static class Example{
        Dog myDog;
    }
}
