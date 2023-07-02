package L9_Interfaces;

public class Duck extends Animal implements Runnable,Swimmable{
    @Override
    public void runSlow() {
        System.out.println("I can run very slow");

    }

    @Override
    public void runFast() {
        System.out.println("But if is a danger i help myself with wings");

    }

    @Override
    public void breathInTheAir() {
        System.out.println("I can breath in the air");

    }

    @Override
    public void swimSlow() {
        System.out.println("");

    }

    @Override
    public void swimFast() {

    }

    @Override
    public void breathUnderWater() {

    }
}
