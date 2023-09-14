public class Rectangle {
    private double length;
    private double width;
    private double angle;
    private int sides;
    private String name;
    Rectangle(){
        length = 1;
        width = 2;
        angle = 90;
        sides = 4;
        name = "Rectangle";
    }
    Rectangle(double length, double width, double angle, int sides, String name){
        this.length = length;
        this.width = width;
        this.angle = angle;
        this.sides = sides;
        this.name = name;
    }
    Double getLength(){
        return length;
    }   
    Double getWidth(){
        return width;
    }   
    String String(){
        return "Length: " + this.length + " Width: " + this.width + " Angle: " + this.angle + " Sides: " + this.sides + " Name: " + this.name;
    }
    void setLength(double length){
        this.length = length;
    }
    void setWidth(double width){
        this.width = width;
    }
    Boolean Equals(Rectangle rectangle){
        if (this.length == rectangle.length && this.width == rectangle.width && this.angle == rectangle.angle && this.sides == rectangle.sides && this.name == rectangle.name){
            return true;
        }
        else{
            return false;
        }
    }
    Double getArea(){
        return length * width;
    }
    Double getPerimeter(){
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
