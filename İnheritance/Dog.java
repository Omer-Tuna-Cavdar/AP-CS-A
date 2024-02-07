package İnheritance;

public class Dog extends Pet{
    private String breed;
    public Dog(String n, String t, String b){
        super(n, t);
        breed = b;
    }
    public Dog(){
        super();
        breed = "No breed yet.";
    }
    @Override
    public void eatfood(){
        System.out.println("I am eating food.");
    }
    @Override
    public String toString(){
        return super.toString() + "Breed: " + breed;
    }
}
