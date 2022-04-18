package nagarjuna.assignment.main;

import nagarjuna.assignment.data.Data;
import nagarjuna.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data obj =new Data();
        obj.display();
        obj.show();
        //static methods can only access static variables.
//        Singleton obj1 = new Singleton("str");
//        obj1.singleton("str");
//        obj1.print();

    }
}
