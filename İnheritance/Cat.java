package İnheritance;

public class Cat extends Pet {
    private String color;
    public Cat(String n, String t, String c){
        super(n, t);
        color = c;
    }
    public Cat(){
        super();
        color = "No color yet.";
    }
    @Override
    public void eatfood(){
        System.out.println("I am eating food.");
    }
    @Override
    public String toString(){
        return super.toString() + "Color: " + color;
    }
    
}
