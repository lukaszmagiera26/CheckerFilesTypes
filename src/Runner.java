import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Runner {
    private FilesImporter filesImporter = new FilesImporter();
    private CheckBytes checkJPG;
    private CheckBytes checkPNG;
    private CheckBytes checkTYPES;
    private CheckTYPES checker = new CheckTYPES();



    public Runner() {
        CheckBytesImpl checkBytesImpl = new CheckBytesImpl();
        //this.checkJPG = new CheckJPG(checkBytesImpl);
        this.checkTYPES = new CheckTYPES(checkBytesImpl);
        //  this.checkPNG = new CheckPNG(checkBytesImpl);
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
                            throw new ExtensionOKCheckNoOkException();
                        }
                        break;
                    case ".gif":
                        if (checkGIF.check(bytes)) {
                            System.out.println("Files extension is" + extension);
                            System.out.println("it was checked correctly file " + extension);
                        } else {
                            throw new ExtensionOKCheckNoOkException();
                        }
                        break;
                    case ".png":
                        if (checkPNG.check(bytes)) {
                            System.out.println("Files extension is" + extension);
                            System.out.println("it was checked correctly file " + extension);
                        } else {
                            throw new ExtensionOKCheckNoOkException();
                        }
                        break;
                    default:
                        System.out.println("Extension Not found!!!");
                }
            } catch (FileNotFoundException e) {
                System.out.println("File Not found!!!");
            } catch (IOException e) {
                System.out.println("IOException");
            } catch (ExtensionOKCheckNoOkException e) {
                System.out.println("Extension ok but check not ok");
            }
        }
    }
}





