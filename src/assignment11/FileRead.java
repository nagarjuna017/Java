package assignment11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

class FileRead {
    HashMap<Character, Integer> Map = new HashMap<Character, Integer>();

    public void characterCount(){
        try {
            FileReader fileread = new FileReader("/home/nagarjp/hello.txt");
            int index;
            while((index = fileread.read())!= -1) {
                if(!Character.isWhitespace((char)index)) {
                    if(Map.containsKey((char)index)) {
                        Map.put((char)index, Map.get((char)index)+1);
                    }
                    else {
                        Map.put((char)index, 1);
                    }
                }
            }

            saveData();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveData() {
        try {
            File f1 = new File("/home/nagarjp/hello1.txt");
            FileWriter filewrite = new FileWriter(f1);
            filewrite.write(Map.toString());
            filewrite.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
};

