package Assignment6_Polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Lion()};

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}