Student Information using Annotations:

// Java program to demonstrate @Override annotation

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding the sound() method of Animal
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.sound();
    }
}

OUTPUT:
<img width="105" height="32" alt="Screenshot 2026-08-13 112649" src="https://github.com/user-attachments/assets/cd779acb-a759-4816-956f-5b028eb0c0bc" />
