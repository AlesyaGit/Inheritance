package Inheritance2;

public class Blowfish extends Fish{

   // String BlowFishType;

    String hazardRating;

    public Blowfish(String name, int age, double weight, String color,String hazardRating) {
        super(name, age, weight, color);
        this.hazardRating = hazardRating;
    }

    @Override
    void eat() {
        System.out.println("Snails,crabs,crayfish and shrimp");
    }

    @Override
    void getVoice() {
        System.out.println("Bool! Bool!");
    }

    public String getHazardRating() {
        return hazardRating;
    }

    public void setHazardRating(String hazardRating) {
        this.hazardRating = hazardRating;
    }


    @Override
    public String toString() {
        return "Blowfish{" + " "+
                "hazardRating='" + hazardRating + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
