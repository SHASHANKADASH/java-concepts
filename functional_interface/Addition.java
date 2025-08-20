package functional_interface;

// this annotation is not mandatory
@FunctionalInterface
public interface Addition {
    // and interface with just one abstract method is a functional interface
    int square(int x);
}
