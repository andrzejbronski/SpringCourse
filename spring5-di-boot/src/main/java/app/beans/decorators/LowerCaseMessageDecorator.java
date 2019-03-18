package app.beans.decorators;

import org.springframework.stereotype.Component;

@Component

public class LowerCaseMessageDecorator implements MessageDecorator {
    @Override
    public String decorate(String str){

        return str.toLowerCase();
    }
}
