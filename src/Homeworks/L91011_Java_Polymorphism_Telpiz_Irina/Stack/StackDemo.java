package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.Stack;

class StackDemo {
    public static void main(String[] args) throws StackFullException, StackEmptyException {

        Stack stack1 = new Stack(10);
        char name[] =  {'T', 'o', 'm'};
        Stack stack2 = new Stack(name);
        char ch;
        int i;

        for (i = 0; i < 10; i++){
            stack1.push((char) ('A' + i));
        }

        Stack stack3 = new Stack(stack1);

        System.out.print("stack1 content: ");
        for (i = 0; i < 10; i++){
            ch = stack1.pop();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("stack2 content: ");
        for (i = 0; i < 3; i++){
            ch = stack2.pop();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("stack3 content: ");
        for (i = 0; i < 10; i++){
            ch = stack3.pop();
            System.out.print(ch);
        }
    }
}
