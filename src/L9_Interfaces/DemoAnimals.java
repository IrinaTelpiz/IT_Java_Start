package L9_Interfaces;

public class DemoAnimals {
    public static void main(String[] args) {
        Cat randomCat = new Cat();
        Fish randomFish = new Fish();
        Duck randomDuck = new Duck();

        whatCanIDoInTheWater(randomDuck);
        whatCanIDoInTheWater(randomFish);
        whatCanIDoOnTheEarth(randomCat);
        whatCanIDoOnTheEarth(randomDuck);
        printInfo(randomCat);
    }

    public static void whatCanIDoInTheWater(Swimmable n){
        System.out.println("I am " + n);
        n.swimSlow();
        n.swimFast();
        n.breathUnderWater();
    }

    public static void whatCanIDoOnTheEarth(Runnable n){
        System.out.println("I am " + n);
        n.runSlow();
        n.runFast();
        n.breathInTheAir();
    }

    public static void printInfo(Animal n){
        n.eat();
    }
}
