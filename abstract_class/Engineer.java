package abstract_class;

// A class extending abstract class must implement all its abstract methods
public class Engineer extends AbstractEmployee {

    public Engineer(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getEmail() {
        return "";
    }

    public static void main(String[] args) {
        // Here the constructor of the abstract class will be used to instantiate the instance variables
        final Engineer engineer = new Engineer("Shashanka", 26);
        System.out.println(engineer.getAge());
    }
}
