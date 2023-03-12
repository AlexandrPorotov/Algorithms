package Patterns.Decorator.decorators;

import Patterns.Decorator.objects.Component;

public class ColorDecorator extends Decorator{

    public ColorDecorator(Component component){
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added color");
    }
}
