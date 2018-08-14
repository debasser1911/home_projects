package LearnPackage.Calculator;

public class ResultParserImpl implements ResultParser {


    @Override
    public Integer parse(Model a) {
        int result = 0;


        switch (a.getOperator()) {
            case "+":
                result = Integer.parseInt(a.getOperandFirst()) + Integer.parseInt(a.getOperandSecond());
                break;
            case "-":
                result = Integer.parseInt(a.getOperandFirst()) - Integer.parseInt(a.getOperandSecond());
                break;
            case "*":
                result = Integer.parseInt(a.getOperandFirst()) * Integer.parseInt(a.getOperandSecond());
                break;
            case "/":
                result = Integer.parseInt(a.getOperandFirst()) / Integer.parseInt(a.getOperandSecond());
                break;

        }

        return result;
    }
}
