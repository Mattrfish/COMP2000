public class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class Bird extends Animal {
    public void animalSound() {
        System.out.println("The Bird tweets ");
    }
} class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog bark");
    }
}
