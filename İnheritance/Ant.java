package İnheritance;

public class Ant extends Pet{
    private int age;
    public Ant(String n, String t, int a){
        super(n, t);
        age = a;
    }
    public Ant(){
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
