
// Interface: Defines a contract for classes that can make sounds
interface SoundMaker {
    void makeSound(); // Abstract method (no implementation)
}

// Abstract Class: Provides a partial implementation and can have abstract methods
abstract class Animal implements SoundMaker {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    // Concrete method
    public String getName() {
        return name;
    }

    // Abstract method-must be implemented by subclasses
    public abstract void eat();
}

// concrete class- Provides a full implementation of all methods
class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }

    // Implementation of abstract method from animal
    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }

    // Implementation of method from SoundMaker interface
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }
}

// Concrete class- another example of a concrete class
class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
    }

    // implementation of the abstract method from animal
    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food.");
    }

    // implementation of method from SoundMaker interface-provides specific behaviour in subclass
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}

// main class to test implementation
public class Main {
    public static void main(String[] args) {
        // create dog object
        Dog dog = new Dog("Bosco");
        dog.eat();       // Calls the eat() method from Dog class
        dog.makeSound(); // Calls the makeSound() method from Dog class

        // create cat object
        Cat cat = new Cat("Paka");
        cat.eat();       // Calls the eat() method from Cat class
        cat.makeSound(); // Calls the makeSound() method from Cat class
    }
}
