package L11_Collections;

import L5_Classes_Arrays.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {



        Dog a = new Dog(1, Dog.Breed.SHEPERD,"Amy",'f');
        Dog b = new Dog(12, Dog.Breed.POODLE,"Bubble",'f');
        Dog c = new Dog(5, Dog.Breed.HUSKY,"Cop",'m');
        Dog d = new Dog(3, Dog.Breed.GOLDEN_RETRIVER,"Baby",'f');
        Dog e = new Dog(7, Dog.Breed.HUSKY,"Boy",'m');

        List<Dog> dogList = Arrays.asList(a,b,c,d,e);

        ArrayList<Dog> myDogsA = new ArrayList<>();

        LinkedList<Dog> myDogsB = new LinkedList<>();

        myDogsA.size();
        myDogsB.size();
        myDogsA.add(e);
        myDogsA.add(0, b);
        myDogsB.add(e);
        myDogsB.add(2, e);
        myDogsA.remove(d);
        myDogsA.remove(3);
        myDogsB.remove(d);
        myDogsB.remove(2);
        myDogsA.addAll(dogList);
        myDogsB.addAll(dogList);



    }
}
