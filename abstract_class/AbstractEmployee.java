package abstract_class;

public abstract class AbstractEmployee {

    String name;
    int age;

    public AbstractEmployee(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public abstract String getName();
    public abstract String getEmail();

    // Not possible : Abstract methods cannot have a body
    // public abstract String getAge() {}

    // Abstract class can have concrete methods
    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        // 'Employee' is an abstract class and hence Employee objects cannot be instantiated
        //  final Employee employee = new Employee();
    }
}
