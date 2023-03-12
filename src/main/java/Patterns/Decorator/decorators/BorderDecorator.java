package Patterns.Decorator.decorators;

import Patterns.Decorator.objects.Component;

public class BorderDecorator extends Decorator{

    public BorderDecorator(Component component){
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added border");
    }
}
