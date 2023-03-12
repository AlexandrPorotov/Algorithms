package Patterns.Decorator.objects;

public class TextView implements Component{
    @Override
    public void draw() {
        System.out.println("draw text view");
    }
}
