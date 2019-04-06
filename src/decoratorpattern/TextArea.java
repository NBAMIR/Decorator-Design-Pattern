package decoratorpattern;

class TextArea implements Widget {

    TextArea(int height, int width){
        
    }
    @Override
    public void draw() {
        System.out.println("Widget Created: TextArea");
    }
    
}
