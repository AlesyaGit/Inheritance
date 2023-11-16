package Inheritance2;

public class Dog extends Mammal {

    //String breedOfDog; name

    String typeOfDog; // huntingOrDomestic

    public Dog( String name, int age, double weight, String typeOfDog,String typeOfMammal) {
        super(name, age, weight, typeOfMammal);
        this.typeOfDog = typeOfDog;
    }

    @Override
    void eat() {
        System.out.println("Meat");
    }

    @Override
    void getVoice() {
        System.out.println("Woof!Woof!");
    }

    public String getTypeOfDog() {
        return typeOfDog;
    }

    public void setTypeOfDog(String typeOfDog) {
        this.typeOfDog = typeOfDog;
    }

    @Override
    public String toString() {
        return "Dog{" + " "+
                "typeOfDog='" + typeOfDog + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
