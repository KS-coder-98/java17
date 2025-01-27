package pl.krzysiek.InitializationOfObjects;

public class SuperConstructor {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Dog's breed: " + dog.getBreed());
    }
}

// Klasa nadrzędna
class Animal {
    private String name;

    // Konstruktor klasy nadrzędnej
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called: " + name);
    }

    public String getName() {
        return name;
    }
}

// Klasa dziedzicząca
class Dog extends Animal {
    private String breed;

    // Konstruktor klasy potomnej
    public Dog(String name, String breed) {
        super(name); // Wywołanie konstruktora klasy nadrzędnej
        this.breed = breed;
        System.out.println("Dog constructor called: " + breed);
    }

    public String getBreed() {
        return breed;
    }
}