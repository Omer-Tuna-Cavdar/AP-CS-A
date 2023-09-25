package UML_Projects;
 class Rectangle2 {
        private double length;
        private double width;
        private  double angel;
        private  int sides;
        private  String name;
        public  Rectangle2() { //2.1 Instances of Classes
                this.length = 2.0;
                this.width = 3.0;
                this.angel = 90.0;
                this.sides = 4;
                this.name = "Rectangle";
        }
        public Rectangle2(double length, double width) { //2.1 Instances of Classes
                this.length = length;
                this.width = width;
                this.angel = 90.0;
                this.sides = 4;
                this.name = "Rectangle";
        }
        public double getLength() { //2.5 Calling a Non-void Method
                return length;
        }
        public double getWidth() { //2.5 Calling a Non-void Method
                return width;
        }
        public String toString(){ //2.6 String Objects - Concatenation, Literals, and More and 2.7 String Methods
                return "length; " + length + " width: " + width + " angel: " + angel + " sides: " + sides + " name: " + name;
        }
        public void setlength(double length) { // 2.3 and 2.4 Calling a Void Method and Calling a Void Method with Parameters
                this.length = length;
        }
        public void setwidth(double width) { // 2.3 and 2.4 Calling a Void Method and Calling a Void Method with Parameters
                this.width = width;
        }

        public boolean equals(Rectangle2 other) { //2.5 Calling a Non-void Method
                return this.length == other.length && this.width == other.width;
        }
        public double getArea() { //2.5 Calling a Non-void Method
                return Math.abs(length * width); //2.9 Math Class
        }
        public double getPerimeter() { //2.5 Calling a Non-void Method
                return Math.abs(2 * (length + width)); //2.9 Math Class
        }
        public double maxvalueforlengthandwidth(){
                return Double.MAX_VALUE;//2.8 Wrapper Classes - Integer and Double
        }
        public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2(); //2.2 Creating and Storing Objects (Instantiation)
        Rectangle2 r2 = new Rectangle2(2.0, 3.0); //2.2 Creating and Storing Objects (Instantiation)
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.equals(r2)); //2.5 Calling a Non-void Method
        System.out.println(r1.getArea()); //2.5 Calling a Non-void Method
        System.out.println(r1.getPerimeter()); //2.5 Calling a Non-void Method
        System.out.println(r2.getArea()); //2.5 Calling a Non-void Method
        System.out.println(r2.getPerimeter()); //2.5 Calling a Non-void Method
        r1.setlength(4);// 2.3 and 2.4 Calling a Void Method and Calling a Void Method with Parameters
        r2.setwidth(7);// 2.3 and 2.4 Calling a Void Method and Calling a Void Method with Parameters
        System.out.println(r1.toString());//2.6 String Objects - Concatenation, Literals, and More and 2.7 String Methods
    }
    }
