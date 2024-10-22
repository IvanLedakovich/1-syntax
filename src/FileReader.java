import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static String readFile(String filePath){
        File myObj = new File(filePath);
        String data = "";
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            System.out.println(line);
            data += line;
        }
        myReader.close();
        return data;
    }
}
