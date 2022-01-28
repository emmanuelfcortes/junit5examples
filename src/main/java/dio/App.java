package dio;

import dio.testjunit.Calculator;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Calculator: "+ calculator.soma(" 2 + 3 "));
        System.out.println("Calculator: "+ calculator.soma(" 3 + 6 "));
    }
}
