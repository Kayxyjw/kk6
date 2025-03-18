package javacore;

public class SingleInheritance {
    String color = "white";

    public SingleInheritance() {
    }

   g public SingleInheritance(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        SingleInheritance defaultAnimal = new SingleInheritance();
        SingleInheritance coloredAnimal = new SingleInheritance("brown");

        System.out.println("Default Animal Color: " + defaultAnimal.color);
        System.out.println("Colored Animal Color: " + coloredAnimal.color);
    }
}