import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        FileReader read =null;
        try {
            var file = new FileReader("test.txt");
            read= file;
            new SimpleDateFormat().parse("");
        }catch (IOException | ParseException e) {
            System.out.println(e);
        }
        finally {
            if(read!=null){
                try {
                    read.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}