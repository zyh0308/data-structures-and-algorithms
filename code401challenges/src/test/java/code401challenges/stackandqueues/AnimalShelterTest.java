package code401challenges.stackandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {


    @Test
    public void enqueueAnimalTest() {

            AnimalShelter test = new AnimalShelter();
            Dog one = new Dog("melo");

            test.enqueueAnimal(one);

            assertEquals("melo", test.dequeueAnimal("dog").name);
        }



    @Test
    public void dequeueAnimalTest() {
        AnimalShelter test = new AnimalShelter();
        Dog one= new Dog("melo");
        Dog two = new Dog("doudou");
        Dog three = new Dog("douge");


        test.enqueueAnimal(one);
        test.enqueueAnimal(two);
        test.enqueueAnimal(three);

        test.dequeueAnimal("dog");
        test.dequeueAnimal("dog");

        assertEquals("douge", test.dequeueAnimal("dog").name);


    }
    @Test public void testDequeueCat() {
        AnimalShelter testTwo = new AnimalShelter();
        Cat one = new Cat("momo");
        Cat two = new Cat("niannian");
        Cat three = new Cat("lido");

        testTwo.enqueueAnimal(one);
        testTwo.enqueueAnimal(two);
        testTwo.enqueueAnimal(three);

        testTwo.dequeueAnimal("cat");
        testTwo.dequeueAnimal("cat");

        assertEquals("lido", testTwo.dequeueAnimal("cat").name);

    }

    @Test public void testDequeueCatAndDog() {
        AnimalShelter testThree = new AnimalShelter();

        Cat one = new Cat("momo");
        Cat two = new Cat("niannian");
        Cat three = new Cat("lido");

        testThree.enqueueAnimal(one);
        testThree.enqueueAnimal(two);
        testThree.enqueueAnimal(three);


        Dog a = new Dog("melo");
        Dog b = new Dog("doudou");
        Dog c = new Dog("douge");

        //enqueue dogs
        testThree.enqueueAnimal(a);
        testThree.enqueueAnimal(b);
        testThree.enqueueAnimal(c);

        //dequeue cat and dog together
        testThree.dequeueAnimal("cat");
        testThree.dequeueAnimal("dog");
        testThree.dequeueAnimal("cat");

        assertEquals("lido", testThree.dequeueAnimal("cat").name);
        assertEquals("doudou", testThree.dequeueAnimal("dog").name);




    }

}
