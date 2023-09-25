package UML_Projects;
public class Pen {
    private String color;
    private boolean erasable;
    void pen(String color, boolean erasable){
        this.color = color;
        this.erasable = erasable;
    }
    String getColor(){
        return color;   
    }
    boolean getErasable(){
        return erasable;
    }   
    String String(){
        return "Color: " + this.color + " Erasable: " + this.erasable;
    }
    void setColor(String color){
        this.color = color;
    }
    void setErasable(boolean erasable){
        this.erasable = erasable;
    }
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        pen1.pen("Blue", true);
        pen2.pen("Red", false);
        System.out.println(pen1.String());
        System.out.println(pen2.String());
    }
}
