package UML_Projects;
public class Rectangle {
    private double length;//declaring variable
    private double width;//declaring variable
    private double angle;//declaring variable
    private int sides;//declaring variable
    private String name;//declaring variable
    Rectangle(){//default constructor
        length = 1;
        width = 2;
        angle = 90;
        sides = 4;
        name = "Rectangle";
    }
    Rectangle(double length, double width, double angle, int sides, String name){
        //constructor
        this.length = length;
        this.width = width;
        this.angle = angle;
        this.sides = sides;
        this.name = name;
    }
    Double getLength(){//getter
        return length;
    }   
    Double getWidth(){//getter
        return width;
    }   
    String String(){//to string method
        return "Length: " + this.length + " Width: " + this.width + " Angle: " + this.angle + " Sides: " + this.sides + " Name: " + this.name;
    }
    void setLength(double length){//setter
        this.length = length;
    }
    void setWidth(double width){//setter
        this.width = width;
    }
    Boolean Equals(Rectangle rectangle){//equals method
        if (this.length == rectangle.length && this.width == rectangle.width && this.angle == rectangle.angle && this.sides == rectangle.sides && this.name == rectangle.name){
            return true;
        }
        else{
            return false;
        }
    }
    Double getArea(){//getter
        return length * width;
    }
    Double getPerimeter(){//getter
        return 2 * (length + width);
    }
    class Square extends Rectangle{
        Square(Double length){
            super();
        }
        Integer getSides(){
            return sides;
        }
        Double getLength(){
            return length;
        }
        Double getWidth(){
            return width;
        }
        void setSide(int Side){
           sides = Side;
        }
        void setLength(double Length){
            length = Length;
        }
        void setWidth(double Width){
            width = Width;
        }
       
    }
}
