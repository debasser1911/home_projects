package LearnPackage;

public class Calculator implements Parser<String, Integer>{

    ModelParser modelParser = new ModelParserImpl();
    ResultParser resultParser = new ResultParserImpl();



    @Override
    public Integer parse(String a) {
        return resultParser.parse(modelParser.parse(a));
    }

    public Integer calculate(String s){
        return parse(s);
    }
}
