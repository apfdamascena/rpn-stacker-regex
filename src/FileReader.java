import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    private final String path;

    public FileReader(String path) {
        this.path = path;
    }

    public String readFileBytes() throws IOException {
        String directory = System.getProperty("user.dir");
        String filepath = directory + this.path;
        byte[] bytes = Files.readAllBytes(Paths.get(filepath));
        String input = new String(bytes, Charset.defaultCharset());
        return input;
    }
}
