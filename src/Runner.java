import java.io.File;

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
            if(userinput.equals("0")) break;
            File file = new File(userinput);




        }



    }


}


