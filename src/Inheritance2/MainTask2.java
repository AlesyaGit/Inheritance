package Inheritance2;

public class MainTask2 {
    public static void main(String[] args) {

        int length = 3;

        Animal [] animal = new Animal[length];

        animal[0] = new Dog("Dachshund", 3, 10.85, "Domestic", "Predator");
        animal[1] = new Pigeon("Emperor penguin",  10, 23, "Wing and Head are black,chest and stomach are white", "Vulnerable position");
        animal[2] = new Blowfish("Fahaka", 5, 1.5, "Striped yellow", "Isn't dangerous");

        for (Animal all : animal){
            System.out.print("Information for:");
            System.out.println(all.getName());
            System.out.println("says:");
            all.getVoice();
            System.out.println("and eats:");
            all.eat();
            System.out.println("Additional info:" + " " + all.toString());
            System.out.println("------------------------------------");

        }
    }
}
