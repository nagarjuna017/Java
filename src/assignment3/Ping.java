package assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ping {

    public static void runSystemCommand(String command) {

        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String string = "";
            while ((string = inputStream.readLine()) != null) {
                System.out.println(string);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
