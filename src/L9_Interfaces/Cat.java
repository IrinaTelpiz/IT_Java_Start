package L9_Interfaces;

public class Cat extends Animal implements Runnable{
    @Override
    public void runSlow() {
        System.out.println("I run slow");

    }

    @Override
    public void runFast() {

    }

    @Override
    public void breathInTheAir() {

    }
}
