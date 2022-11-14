public class Turtle extends Animal {

    public Turtle(String name) {
        super(name);
    }

    @Override
    public void method() {
        super.method();
    }

    public void swim(){
        System.out.println("The "+ getName() + " swims in the Pacific Ocean" +
                "\n----------------------------------");
    }
}
