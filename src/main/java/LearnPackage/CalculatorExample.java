package LearnPackage;

public class CalculatorExample {

    public static void main(String[] args) {
        String input = "3 + 2";

        Calculator calc = new Calculator();
        int result = calc.calculate(input);

        System.out.println(input + " = " + result);


    }


}
