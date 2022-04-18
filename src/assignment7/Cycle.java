package assignment7;

abstract class Cycle{
    public abstract void balance();
}

class Unicycle extends Cycle {
    public void balance(){
        System.out.println("Balancing is tough. ");
    }
}

class Bicycle extends Cycle {
    public void balance(){
        System.out.println("Balancing is easy.");
    }
}
//class Tricycle extends Cycle{
////getting error in this code as Tricycle class inherite class Cycle but balance() is not declare by this class
//};
class CycleMain{
    public static void main(String[] args) {
        Cycle[] obj = new Cycle[3];
        obj[0] = new Unicycle();
        obj[0].balance();
        obj[1] = new Bicycle();
        obj[1].balance();
//        obj[2] = new Tricycle();
//        obj[2].balance();
    }
}
