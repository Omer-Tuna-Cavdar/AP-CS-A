package UML_Projects;
public class Band {
    private String artist; //declaring variable
    private int age; //declaring variable
    void Band (String artist, int age){//constructor
        this.artist = artist;
        this.age = age;
    }
    String getArtist(){//getter
        return artist;
    }
    Integer getAge(){//getter
        return age;
    }
    String String(){//to string method
        return "Artist: " + this.artist + " Age: " + this.age;
    }
    void setArtist(String artist){//setter
        this.artist = artist;
    }
    void setAge(int age){//setter
        this.age = age;
    }
    public static void main(String[] args) { //main method
        Band band1 = new Band();//creating object band1
        Band band2 = new Band();//creating object band2
        band1.Band("Metallica", 40);//calling constructor
        band2.Band("Iron Maiden", 45);//calling constructor
        System.out.println(band1.String());//printing band1
        System.out.println(band2.String());//printing band2
    }
}
