package Inheritance2;

public class Bird extends Animal {

    String featherColor;

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    void eat() {

    }

    @Override
    void getVoice() {

    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }


    @Override
    public String toString() {
        return "Bird{" + " "+
                "featherColor='" + featherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
