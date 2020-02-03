package code401challenges.stackandqueues;

    public class AnimalShelter {
    Queue <Dog> dogs;
    Queue <Cat> cats;

    public AnimalShelter() {
        this.dogs = new Queue<>();
        this.cats = new Queue<>();
    }

    public void enqueueAnimal(Dog dog){
        dogs.enqueue(dog);
    }
    public void enqueueAnimal(Cat cat){
        cats.enqueue(cat);

    }
    public Animal dequeueAnimal(String preference){
        switch(preference.toLowerCase()){
            case "dog":
                return this.dogs.dequeue();
            case "cat":
                return this.cats.dequeue();
        }
        throw new IllegalArgumentException();
    }
}
