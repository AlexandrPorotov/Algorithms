package Core.OrderOfInitialization;

class Window {

    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }

}

//Тут намеренно разбросаны поля по классу, что бы показать что сначала инициализируются они, затем уже с ними что то происходит
class House {

    Window w1 = new Window(1);

    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);

}

public class OrderOfInitialization {

    public static void main(String[] args) {
        House h = new House();
        h.f();
    }

}
