import javax.naming.InsufficientResourcesException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class FileUtil {
    public static String read(String name) throws IOException {
        StringBuilder text = new StringBuilder();
        try {
            Scanner reader = new Scanner(new FileInputStream(name));
            while (reader.hasNext()) {
                text.append(reader.nextLine()).append("\n");
            }
            reader.close();
            return text.toString();

        } catch (IOException e) {
            throw e;
        }
    }
}
