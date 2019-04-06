package decoratorpattern;

class TextField implements Widget {

    TextField(int height, int width){
        
    }
    @Override
    public void draw() {
        System.out.println("Widget Created: TextField");
    }
    
}
