package assignment7;



interface Cycles{
    void cycle();
    void factories();

}
class UniCycle implements Cycles{
    public void cycle(){
        factories();
    }
    public void factories(){
        System.out.println("Unicycle.");
    }

};
class BiCycle implements Cycles{
    public void cycle(){
        factories();
    }
    public void factories(){
        System.out.println("Bicycle.");
    }
};
class TriCycle implements Cycles{
    public void cycle(){
        factories();
    }
    public void factories(){
        System.out.println("Tricycle.");
    }
};
class MainClass {
    public static void main(String[] args){
        UniCycle obj = new UniCycle();
        obj.cycle();
        BiCycle obj1 = new BiCycle();
        obj1.cycle();
        TriCycle obj2 = new TriCycle();
        obj2.cycle();
    }
}
