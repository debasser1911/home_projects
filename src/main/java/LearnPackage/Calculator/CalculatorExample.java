package LearnPackage.Calculator;

public class CalculatorExample {

    public static void main(String[] args) {
        String input = "244 + 387";
        String input2 = "244 - 387";
        String input3 = "244 * 387";
        String input4 = "244 / 387";

        Calculator calc = new Calculator();
        int result = calc.calculate(input);
        int result2 = calc.calculate(input2);
        int result3 = calc.calculate(input3);
        int result4 = calc.calculate(input4);

        System.out.println(input + " = " + result);
        System.out.println(input2 + " = " + result2);
        System.out.println(input3 + " = " + result3);
        System.out.println(input4 + " = " + result4);


    }


}
