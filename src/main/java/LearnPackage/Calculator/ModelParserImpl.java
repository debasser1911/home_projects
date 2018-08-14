package LearnPackage.Calculator;

public class ModelParserImpl implements ModelParser {


    @Override
    public Model parse(String s) {
        Model model;

        try {
            String[] result = s.split(" ");
            model = new Model(result[0], result[1], result[2]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new IllegalArgumentException("Invalid input, use spaces! " + "(" + s + ")");
        }


        return model;
    }
}
