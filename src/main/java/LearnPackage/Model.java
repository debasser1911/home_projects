package LearnPackage;

public class Model {
    private final String operandFirst;
    private final String operandSecond;
    private final String operator;

    public Model(String operandFirst, String operator, String operandSecond) {
        this.operandFirst = operandFirst;
        this.operandSecond = operandSecond;
        this.operator = operator;
    }

    public String getOperandFirst() {
        return operandFirst;
    }

    public String getOperandSecond() {
        return operandSecond;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return "Model{" +
                "operandFirst='" + operandFirst + '\'' +
                ", operator='" + operator + '\'' +
                ", operandSecond='" + operandSecond + '\'' +
                '}';
    }
}
