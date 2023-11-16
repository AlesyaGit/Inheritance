package Inheritance2;

public class Pigeon extends Bird {

    String conservationStatus;

    public Pigeon(String name, int age, double weight, String featherColor, String conservationStatus) {
        super(name, age, weight, featherColor);
        this.conservationStatus = conservationStatus;
    }

    @Override
    void eat() {
        System.out.println("Fish");
    }

    @Override
    void getVoice() {
        System.out.println("Quack!");
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }



    @Override
    public String toString() {
        return "Pigeon{" +" "+
                "conservationStatus='" + conservationStatus + '\'' +
                ", featherColor='" + featherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
