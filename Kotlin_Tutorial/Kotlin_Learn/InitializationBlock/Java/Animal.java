package Kotlin_Learn.InitializationBlock.Java;

public class Animal {
    private String animalName;

    {
        // Khối khởi tạo
        animalName = "DefaultName";
        System.out.println("Animal is created with name: " + animalName);
    }

    public Animal(String name) {
        animalName = name;
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal("Dog");
    }
}
