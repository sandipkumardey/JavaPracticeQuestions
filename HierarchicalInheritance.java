class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }

    void displayType() {
        System.out.println("Type of animal: " + type);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String type, String breed) {
        super(type);
        this.breed = breed;
    }

    void displayBreed() {
        System.out.println("Breed of dog: " + breed);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Mammal", "Labrador");
        dog.displayType();
        dog.displayBreed();
    }
}
