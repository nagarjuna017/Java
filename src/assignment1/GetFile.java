package assignment1;

import java.io.File;
import java.util.Scanner;

// demo class is created
public class GetFile {

    void locateFile()
    {
        File file = new File("/home/nagarjp");
        String str ;
        Scanner in = new Scanner(System.in);
        do{
            int ab =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            str =in.nextLine();
            String[] files = file.list();
            for (String string : files){
                Boolean str1 = str.equals(string);
                if (str1){
                    ab = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            if(ab == 0)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);
    }

}


