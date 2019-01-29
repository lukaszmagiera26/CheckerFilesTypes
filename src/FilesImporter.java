import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FilesImporter {
    private final int ARRAY_SIZE = 6;
    private Scanner sc = new Scanner(System.in);

    public String readUserInput() {
        return sc.nextLine();
    }


    public int[] readFilesBytes (File userInput) throws IOException {
        int[] bytes = new int[ARRAY_SIZE];
        InputStream is = new FileInputStream(userInput);
        for (int i = 0; i < ARRAY_SIZE; i++) {
            bytes[i] = is.read();
        }
        return bytes;
    }



}
