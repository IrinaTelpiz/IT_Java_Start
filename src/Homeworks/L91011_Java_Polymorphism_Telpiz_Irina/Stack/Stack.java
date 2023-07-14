package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.Stack;

class Stack {

    private char stack[];
    private int top;

    Stack(int size){
        stack = new char[size];
        top = 0;
    }

    Stack(Stack ob){
        top = ob.top;
        stack = new char[ob.stack.length];
        for (int i = 0; i < top; i++)
            stack[i] = ob.stack[i];
    }

    Stack(char x[]){
        stack = new char[x.length];
        for (int i = 0; i < x.length; i++){
            try {
                push(x[i]);
            }
            catch (StackFullException exc){
                System.out.println(exc);
            }
        }
    }

    void push(char ch) throws StackFullException{
        if (top == stack.length)
            throw  new StackFullException(stack.length);
        stack[top] = ch;
        top++;
    }

    char pop() throws StackEmptyException{
        if (top == 0)
            throw new StackEmptyException();
        top--;
        return stack[top];
    }
}
