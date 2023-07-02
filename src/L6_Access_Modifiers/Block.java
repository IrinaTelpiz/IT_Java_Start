package L6_Access_Modifiers;

import java.util.Scanner;

public class Block {
    int a, b, c;
    int volume;

    Block(int i,int j,int k){
        a=i;
        b=j;
        c=k;
        volume=a*b*c;
    }
    boolean sameBlock(Block obj){
        if ((obj.a == a) & (obj.b == b) & (obj.c == c)) return true;
        else return false;
    }
    boolean sameVolume(Block obj){
        if (obj.volume == volume) return true;
        else return false;
    }

    static Block orderBlock(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        System.out.println("Enter c:");
        int c = in.nextInt();
        return new Block(a,b,c);
    }

}
