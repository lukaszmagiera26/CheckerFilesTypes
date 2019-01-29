import java.io.File;
import java.io.IOException;

public class Runner {
    private FilesImporter filesImporter = new FilesImporter();
    private Checker checkJPG;


    public Runner() {
        CheckBytesImpl checkBytesImpl = new CheckBytesImpl();
        this.checkJPG = new CheckJPG(checkBytesImpl);


    }

    void run() {
        while (true) {

            System.out.printf("If you want to close type : 0 \n");
            System.out.printf("Enter path:");
            String userinput = filesImporter.readUserInput();
            if (userinput.equals("0")) break;
            File file = new File(userinput);
            try {
                int[] bytes = filesImporter.readFilesBytes(file);
                String extension = userinput.substring(userinput.lastIndexOf('.'));
                switch (extension) {
                    case ".jpg":
                        if (checkJPG.check(bytes)) {
                            System.out.println("Files extension is" + extension);
                            System.out.println("it was checked correctly file" + extension);
                        } else {
                            System.out.println("NO OK TYPE");
                        }
                    default:
                        System.out.println("Extension Not found!!!");
                        break;
                }


            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

}


