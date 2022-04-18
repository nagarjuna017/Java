package nagarjuna.assignment.singleton;

public class Singleton {
    String str;
    Singleton(String string){
        str=string;
    }

//    public static singleton(String str1) {
//        str=str1;
//        Singleton sc = new Singleton(str1);
//        return sc;
//    }
    public void print() {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        String str = "ABCD";
        Singleton obj = new Singleton(str);
//        obj.B_method(str);
//        obj.print();
    }
}
