package Transformation;

public class EmailTransform extends cucumber.api.Transformer<String> {


    @Override
    public String transform(String username) {
        return username.concat("ea.com");
    }
}
