public class CheckJPG implements Checker {

    private final int[] JPG_MAGIC = new int[]{0xFF, 0xD8, 0xFF, 0xE0, 0x00, 0x10};
    private CheckBytes checkBytesImpl;


    public CheckJPG(CheckBytes checkBytesImpl) {
        this.checkBytesImpl = checkBytesImpl;
    }



    public boolean check(int[] bytes) {
        return false;
    }
}
