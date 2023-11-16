package Inheritance2;

public class Mammal extends Animal {

   // String nameOfMammal;//волк,обезьяна...

    String typeOfMammal;///приматы,Хищники и т.д


    public Mammal(String name, int age, double weight, String typeOfMammal) {
        super(name, age, weight);
        this.typeOfMammal = typeOfMammal;
    }

    @Override
    void eat() {

    }

    @Override
    void getVoice() {

    }

    public String getTypeOfMammal() {
        return typeOfMammal;
    }

    public void setTypeOfMammal(String typeOfMammal) {
        this.typeOfMammal = typeOfMammal;
    }

    @Override
    public String toString() {
        return "Mammal{" + " "+
                "typeOfMammal='" + typeOfMammal + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
