package decoratorpattern;

public class DecoratorPattern {
	public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************ Decorating Text Field ************");
        Widget widgetTextField = new BorderDecorator(new VerticalScrollDecorator(new HorizontalScrollDecorator(new TextField(80, 24))));
        widgetTextField.draw();

        System.out.println("************ Decorating Text Area ************");        
        Widget widgetTextArea = new BorderDecorator(new BorderDecorator(new HorizontalScrollDecorator(new TextArea(200, 50))));
        widgetTextArea.draw();
        
        System.out.println("************ Decorating Box ************");
        Widget widgetBox = new HorizontalScrollDecorator(new BorderDecorator(new HorizontalScrollDecorator(new Box(150,150))));
        widgetBox.draw();

    }
}
