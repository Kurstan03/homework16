import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Shark("shark"),
                new Shark("akula"),
                new Turtle("turtle"),
                new Turtle("tash baka"),
                new Eagle("eagle"),
                new Eagle("shumkar")
        };
        method(animals);

        Shark[] sharks = new Shark[animals.length];
        Turtle[] turtles = new Turtle[animals.length];
        Eagle[] eagles = new Eagle[animals.length];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getClass().equals(Shark.class)) {
                sharks[i] = (Shark) animals[i];
            }
            if (animals[i].getClass().equals(Turtle.class)) {
                turtles[i] = (Turtle) animals[i];
            }
            if (animals[i].getClass().equals(Eagle.class)) {
                eagles[i] = (Eagle) animals[i];
            }
        }

    }

    public static void method(Animal[] animals) {
        for (Animal animal : animals) {
            animal.method();
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
            } else if (animal.getClass().equals(Turtle.class)) {
                ((Turtle) animal).swim();
            } else if (animal.getClass().equals(Eagle.class)) {
                ((Eagle) animal).fly();
            }
        }

    }
}