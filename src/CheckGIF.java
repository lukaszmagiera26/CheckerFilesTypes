public class CheckGIF implements Checker{

    private final int[] GIF_MAGIC_89a = new int[]{0x47, 0x49, 0x46, 0x38, 0x39, 0x61};
    private CheckBytesImpl checkBytesImpl;

    public CheckGIF(CheckBytesImpl checkBytesImpl) {
        this.checkBytesImpl = checkBytesImpl;
    }
    public boolean check(int[] bytes) {
        return checkBytesImpl.check(bytes, GIF_MAGIC_89a);
    }
}








