import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Runner {
    private FilesImporter filesImporter = new FilesImporter();
    private CheckBytes checkTYPES;
    private CheckTYPES checker = new CheckTYPES();

    public Runner() {
        CheckBytesImpl checkBytesImpl = new CheckBytesImpl();
        this.checkTYPES = new CheckTYPES(checkBytesImpl); }

    void run() {
        while (true) {
            System.out.printf("If you want to close type : 0 \n");
            System.out.printf("Enter path:");
            String userinput = filesImporter.readUserInput();
            if(userinput.equals("0")) break;
            File file = new File(userinput);

            try {
                int[] bytes = filesImporter.readFilesBytes(file);
                String extension = userinput.substring(userinput.lastIndexOf('.'));
                switch (extension) {
                    case ".jpg":
                        if (checkTYPES.check(bytes, checker.getJPG_MAGIC())) {
                            System.out.println("Files extension is" + extension);
                            System.out.println( "it was checked correctly file"+ extension); }
                        else{
                            throw new ExtensionOKCheckNoOkException(); }
                        break;
                    case ".gif":
                        if (checkTYPES.check(bytes, checker.getGIF_MAGIC_89a())) {
                            System.out.println("Files extension is"+ extension);
                            System.out.println("it was checked correctly file "+ extension); }
                        else{
                            throw new ExtensionOKCheckNoOkException(); }
                        break;
                    case ".png":
                        if (checkTYPES.check(bytes, checker.getPNG_MAGIC()))  {
                            System.out.println("Files extension is"+ extension);
                            System.out.println("it was checked correctly file "+ extension); }
                        else{
                            throw new ExtensionOKCheckNoOkException(); }
                        break;
                    default:
                        System.out.println("Extension Not found!!!"); }
                        
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





