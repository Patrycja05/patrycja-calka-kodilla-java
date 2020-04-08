package con.kodilla.testing;

import con.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator();

        int sum = calculator.add(5,7);
        int sub = calculator.subtract(7, 5);

        if(sum == 12 && sub == 2){
            System.out.println("Great job!");
        } else {
            System.out.println("Correct your code!");
        }
    }
}
