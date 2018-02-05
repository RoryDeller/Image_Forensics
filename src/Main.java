import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException, IOError, FileNotFoundException {
        int line;
        FileInputStream fileIP = new FileInputStream("card.raw");
        FileOutputStream fileOP = new FileOutputStream("card.raw");
        do {
            line = fileIP.read();
            Binary_Hex();

        } while (line = fileIP.read() != null);
        fileIP.close();
    }

    public static String Binary_Hex(int line){

        return;
    }




}
