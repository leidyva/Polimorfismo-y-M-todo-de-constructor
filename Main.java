class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        Animal myChicken = new Chicken();
        myAnimal.animalSound();
        myAnimal.animalWalk();
        myPig.animalSound();
        myDog.animalSound();
        myChicken.animalSound();
        myChicken.animalWalk();
    }
}