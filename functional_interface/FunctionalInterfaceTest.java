package functional_interface;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        Addition addition =x -> x*x;
        System.out.println(addition.square(4));
    }
}
