package decoratorpattern;

class BorderDecorator extends WidgetDecorator {
    
    BorderDecorator(Widget decoratedWidget) {
        super(decoratedWidget);
        this.decoratedWidget = decoratedWidget;
    }
    
    public void draw(){
        decoratedWidget.draw();
        setBorder(decoratedWidget);
    }
    
    public void setBorder(Widget Border) {
        System.out.println("Decorator: Border");
    }
    
}