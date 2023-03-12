package Patterns.Decorator.objects;

public class Window implements Component{
    @Override
    public void draw() {
        System.out.println("draw window");
    }
}
