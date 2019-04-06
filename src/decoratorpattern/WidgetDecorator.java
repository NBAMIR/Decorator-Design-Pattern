package decoratorpattern;

abstract class WidgetDecorator implements Widget {
    protected Widget decoratedWidget;
    
    WidgetDecorator(Widget decoratedWidget) {
        this.decoratedWidget = decoratedWidget;
    }
    
    public void draw(){
        decoratedWidget.draw();
    }
    
}