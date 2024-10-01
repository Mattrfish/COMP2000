// Abstract class
public abstract class AbstractAnimal { //public interface also works
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("asleep");
    }
}
// Subclass (inherit from Animal)
class Dogs extends AbstractAnimal { //interface uses implements
    public void animalSound() {
// The body of animalSound() is provided here
        System.out.println("The Dog Bark");
    }
}
class Main {
    public static void main(String[] args) {
        Dogs dog = new Dogs(); // Create a Dogs object
        dog.animalSound();
        dog.sleep();
    }
}
