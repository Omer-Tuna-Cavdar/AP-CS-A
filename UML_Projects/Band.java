package UML_Projects;
public class Band {
    private String artist;
    private int age;
    void Band (String artist, int age){
        this.artist = artist;
        this.age = age;
    }
    String getArtist(){
        return artist;
    }
    Integer getAge(){
        return age;
    }
    String String(){
        return "Artist: " + this.artist + " Age: " + this.age;
    }
    void setArtist(String artist){
        this.artist = artist;
    }
    void setAge(int age){
        this.age = age;
    }
    public static void main(String[] args) {
        Band band1 = new Band();
        Band band2 = new Band();
        band1.Band("Metallica", 40);
        band2.Band("Iron Maiden", 45);
        System.out.println(band1.String());
        System.out.println(band2.String());
    }
}
