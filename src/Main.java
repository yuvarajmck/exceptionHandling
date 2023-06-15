import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        try {
            var file = new FileReader("test.txt");
            var read=file.read();
            new SimpleDateFormat().parse("");
        }catch (IOException | ParseException e) {
            System.out.println(e);
        }

    }
}