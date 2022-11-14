public class Eagle extends Animal{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void method() {
        super.method();
    }

    public void fly(){
        System.out.println("The " + getName() + " flies over the rocks" +
                "\n----------------------------------");
    }
}
