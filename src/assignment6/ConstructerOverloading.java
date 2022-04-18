package assignment6;

public class ConstructerOverloading {
    ConstructerOverloading() {

        System.out.println("Default Constructor ");
    }
    ConstructerOverloading(int str) {
        this();
        System.out.println(str);
    }
    public static void main(String[] args) {
        ConstructerOverloading obj = new ConstructerOverloading(005);
    }
}

