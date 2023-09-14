public class Dog {
    private String name;
    private String breed;
    private int age;
    void dog(){
        name = "Karabas";
        breed = "Kangal";
        age = 2;
    }
    void dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    String getName(){
        return name;
    }   
    String getBreed(){
        return breed;
    }
    Integer getAge(){
        return age;
    }
    String String(){
        return "Name: " + this.name + " Breed: " + this.breed + " Age: " + this.age;
    }
    String setName(String name){
        this.name = name;
        return name;
    } 
    String setBreString(String breed){
        this.breed = breed;
        return breed;
    }
    Integer setAge(int age){
        this.age = age;
        return age;
    }
    Boolean equals(Dog dog){
        if (this.name == dog.name && this.breed == dog.breed && this.age == dog.age){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.dog();
        dog2.dog("Kara", "Kangal", 3);
        System.out.println(dog1.String());
        System.out.println(dog2.String());
        System.out.println(dog1.equals(dog2));
    }
}
