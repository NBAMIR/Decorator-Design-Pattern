package decoratorpattern;

class Box implements Widget {

    Box(int height, int width){
        
    }
    @Override
    public void draw() {
        System.out.println("Widget Created: Box");
    }
    
}