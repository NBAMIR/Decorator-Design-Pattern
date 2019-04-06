package decoratorpattern;

class VerticalScrollDecorator extends WidgetDecorator {
    
    VerticalScrollDecorator(Widget decoratedWidget) {
        super(decoratedWidget);
        this.decoratedWidget = decoratedWidget;
    }
    
    public void draw(){
        decoratedWidget.draw();
        setVerticalScrollbar(decoratedWidget);
    }
    
    public void setVerticalScrollbar(Widget Border) {
        System.out.println("Decorator: Vertical Scrollbar");
    }
    
}
