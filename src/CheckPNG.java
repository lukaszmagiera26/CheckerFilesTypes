public class CheckPNG implements Checker {

    private final int[] PNG_MAGIC = new int[]{0x89, 0x50, 0x4e, 0x47, 0x0d, 0x0a};
    private CheckBytes checkBytesImpl;

    public CheckPNG(CheckBytes checkBytesImpl) {
        this.checkBytesImpl = checkBytesImpl;
    }
    public boolean check(int[] bytes) {
        return checkBytesImpl.check(bytes, PNG_MAGIC);
    }
}