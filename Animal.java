class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
    public void animalWalk(){
        System.out.println("These animals walk in 4 paws");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
class Chicken extends Animal {
    public void animalSound() {
        System.out.println("The chicken says: po po po po");
    }
    public void animalWalk(){
        System.out.println("The chicken walks in 2 paws");
    }
}
