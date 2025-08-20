package anonymous_class;


public class AnonymousClassExample {

    int experience;

    int getBonus() {
        return this.experience * 5000;
    }

    public static void main(String[] args) {
        // This is an anonymous class. It doesn't have a name
        // Here we are extending the abstract class Calculate
        Calculate calculate = new Calculate() {
            @Override
            int sum(final int x, final int y){
              return x+y;
            }
        };
        System.out.println(calculate.sum(4,5));

        // This is an anonymous class. It doesn't have a name
        // Here we are implementing the interface Display
        Display display = new Display() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };
        display.print("Hello");

        // When creating an anonymous class by implementing an interface and that interface has only one abstract method(or one method)
        // Then we can simplify the anonymous class into a lambda expressions
        Display display1 = System.out::println;
        display1.print("World");
    }
}

abstract class Calculate {
    abstract int sum(final int x, final int y);
}

interface Display {
   void print(String s);
   // void get();
}
