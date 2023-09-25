package UML_Projects;
public class Dog {
    private String name;//declaring variable
    private String breed;//declaring variable
    private int age;//declaring variable
    void dog(){//default constructor
        name = "Karabas";
        breed = "Kangal";
        age = 2;
    }
    void dog(String name, String breed, int age){//constructor
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    String getName(){//getter
        return name;
    }   
    String getBreed(){//getter
        return breed;
    }
    Integer getAge(){//getter
        return age;
    }
    String String(){//to string method
        return "Name: " + this.name + " Breed: " + this.breed + " Age: " + this.age;
    }
    String setName(String name){//setter
        this.name = name;
        return name;
    } 
    String setBreString(String breed){//setter
        this.breed = breed;
        return breed;
    }
    Integer setAge(int age){//setter
        this.age = age;
        return age;
    }
    Boolean equals(Dog dog){//equals method
        if (this.name == dog.name && this.breed == dog.breed && this.age == dog.age){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {//main method
        Dog dog1 = new Dog();//creating object dog1
        Dog dog2 = new Dog();//creating object dog2
        dog1.dog();//calling constructor
        dog2.dog("Kara", "Kangal", 3);//calling constructor
        System.out.println(dog1.String());//printing dog1
        System.out.println(dog2.String());//printing dog2
        System.out.println(dog1.equals(dog2));//printing dog1 equals dog2
    }
}
