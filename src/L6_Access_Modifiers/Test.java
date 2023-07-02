package L6_Access_Modifiers;

public class Test {

    int a,b;
    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }
    void change(){
        a =a + b;
        b = -b;
    }
    static void change(Test obj){
        obj.a = obj.a + obj.b;
        obj.b = -obj.b;
    }
}
