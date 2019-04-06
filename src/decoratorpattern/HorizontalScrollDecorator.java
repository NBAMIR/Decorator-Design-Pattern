package decoratorpattern;

class HorizontalScrollDecorator extends WidgetDecorator {
    
    HorizontalScrollDecorator(Widget decoratedWidget) {
        super(decoratedWidget);
        this.decoratedWidget = decoratedWidget;
    }
    
    public void draw(){
        decoratedWidget.draw();
        setHorizontalScrollbar(decoratedWidget);
    }
    
    public void setHorizontalScrollbar(Widget Border) {
        System.out.println("Decorator: Horizontal Scrollbar");
    }
    
}
