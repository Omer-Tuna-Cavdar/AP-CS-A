package İnheritance;

public class Cat extends Pet {
    private int age;
    public Cat(String n, String t, int a){
        super(n, t);
        age = a;
    }
    public Cat(){
        super();
        age = 0;
    }
    @Override
    public void eatfood(){
        System.out.println("I am eating food.");
    }
    @Override
    public String toString(){
        return super.toString() + "Age: " + age;
    }
    
}
