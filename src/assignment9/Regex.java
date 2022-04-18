package assignment9;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex
{
    public void isRegex(String string) {
        String regexPattern="[A-Z].*[.]";
        boolean flag=Pattern.matches(regexPattern, string);
        if(flag){
            System.out.println("It follows Regex pattern");
        }
        else{
            System.out.println("It do not follow a Regex pattern");
        }
    }
    public static void main(String[] args)
    {
        String string;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter a string: ");
        string = in.nextLine();
        Regex regex = new Regex();
        regex.isRegex(string);
    }
}