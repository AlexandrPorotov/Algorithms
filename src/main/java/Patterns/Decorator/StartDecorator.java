package Patterns.Decorator;

import Patterns.Decorator.decorators.BorderDecorator;
import Patterns.Decorator.decorators.ColorDecorator;
import Patterns.Decorator.objects.Component;
import Patterns.Decorator.objects.TextView;
import Patterns.Decorator.objects.Window;

public class StartDecorator {

    private static Component window;
    private static Component textView;

    public static void main(String[] args) {

        boolean showBorder = true;

        if(!showBorder){
            window = new Window();
            textView = new TextView();
        } else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
        }

        window.draw();
        textView.draw();

    }
}
