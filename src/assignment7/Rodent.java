package assignment7;

abstract class Rodent{
    Rodent(){
        System.out.println("Constructor of Rodent.");
    }
    public abstract void age();
    public abstract void display();

} ;
class Mouse extends Rodent{
    Mouse(){
        System.out.println(" Constructor of Mouse");
    }
    public void age(){
        System.out.println("Mouse is 19 years old");
    }
    public void display(){
        System.out.println("Mouse");
    }
};
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Constructor of Gerbil");
    }
    public void age(){
        System.out.println("Gerbil is 20 years old");
    }
    public void display(){
        System.out.println("Gerbil");
    }
};
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Constructor of Hamster");
    }
    public void age(){
        System.out.println("Hamster is 21 years old");
    }
    public void display(){
        System.out.println("Hamster");
    }
};
class RodentMain {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].display();
        rodent[0].age();
        rodent[1] = new Gerbil();
        rodent[1].display();
        rodent[1].age();
        rodent[2] = new Hamster();
        rodent[2].display();
        rodent[2].age();
    }
}