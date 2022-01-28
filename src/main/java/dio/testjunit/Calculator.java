package dio.testjunit;

import java.util.regex.Pattern;

public class Calculator {
    
    public Integer soma(String expression) {
        System.out.println("The expression is: "+ expression);
        Integer sun = 0;
        for(String somaString: expression.split(Pattern.quote("+"))){
            sun+= Integer.valueOf(somaString.strip());
        }
        System.out.println("The length of split expression is: "+ expression.split(Pattern.quote("+")).length);
        return sun;
    }
}
