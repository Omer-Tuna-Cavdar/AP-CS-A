package İnheritance;

public class Pet {
    private String name;
    private String type;
    public Pet(String n, String t){
        name = n;
        type = t;
    }
    public Pet(){
        name = "No name yet.";
        type = "No type yet.";
    }
    public String getName(){
        return name;
    }
    public void eatfood(){
        System.out.println("I am eating food.");
    }
    public String toString(){
        return "Name: " + name + "Type: " + type;
    }
    
}


