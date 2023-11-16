package Inheritance2;

public class Fish extends Animal {

    String color;

    public Fish(String name, int age, double weight, String color) {
        super(name, age, weight);
        this.color = color;
    }

    @Override
    void eat() {

    }

    @Override
    void getVoice() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Fish{" + " "+
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
