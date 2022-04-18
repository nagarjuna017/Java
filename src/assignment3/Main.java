package assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String stringinput;
        Scanner in = new Scanner(System.in);
        Ping ping=new Ping();
        System.out.println("Enter the ip address : ");
        stringinput =in.nextLine();
        ping.runSystemCommand("ping -c 5  " + stringinput);


    }
}
