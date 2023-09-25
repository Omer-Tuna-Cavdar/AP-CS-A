package UML_Projects;
public class Pen {
    private String color;// declaring variable
    private boolean erasable; //declaring variable
    void pen(String color, boolean erasable){//constructor
        this.color = color;
        this.erasable = erasable;
    }
    String getColor(){//getter
        return color;   
    }
    boolean getErasable(){//getter
        return erasable;
    }   
    String String(){//to string method
        return "Color: " + this.color + " Erasable: " + this.erasable;
    }
    void setColor(String color){//setter
        this.color = color;
    }
    void setErasable(boolean erasable){//setter
        this.erasable = erasable;
    }
    public static void main(String[] args) {
        Pen pen1 = new Pen();//creating object pen1
        Pen pen2 = new Pen();//creating object pen2
        pen1.pen("Blue", true);//calling constructor
        pen2.pen("Red", false);//calling constructor
        System.out.println(pen1.String());//printing pen1
        System.out.println(pen2.String());//printing pen2
    }
}
