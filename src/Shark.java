public class Shark extends Animal{

    public Shark(String name) {
        super(name);
    }

    @Override
    public void method() {
        super.method();
    }

    public void attack(){
        System.out.println("The " + getName() + " attacks fish" +
                "\n----------------------------------");
    }
}
