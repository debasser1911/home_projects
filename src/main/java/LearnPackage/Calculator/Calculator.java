package LearnPackage.Calculator;

public class Calculator implements Parser<String, Integer>{

    private ModelParser modelParser = new ModelParserImpl();
    private ResultParser resultParser = new ResultParserImpl();



    @Override
    public Integer parse(String a) {
        return resultParser.parse(modelParser.parse(a));
    }

    public Integer calculate(String s){
        return parse(s);
    }
}
