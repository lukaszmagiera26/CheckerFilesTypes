public class CheckTYPES implements CheckBytes{
    private int[] GIF_MAGIC_89a = new int[]{0x47, 0x49, 0x46, 0x38, 0x39, 0x61};
    private int[] JPG_MAGIC = new int[]{0xFF, 0xD8, 0xFF, 0xE0, 0x00, 0x10};
    private int[] PNG_MAGIC = new int[]{0x89, 0x50, 0x4e, 0x47, 0x0d, 0x0a};
    private CheckBytes checkBytesImpl;

    public int[] getGIF_MAGIC_89a() {
        return GIF_MAGIC_89a; }
    public int[] getJPG_MAGIC() {
        return JPG_MAGIC; }
    public int[] getPNG_MAGIC() {
        return PNG_MAGIC; }
    public CheckTYPES(CheckBytes checkBytesImpl) {
        this.checkBytesImpl = checkBytesImpl; }

    public CheckTYPES() { }
    public boolean check(int[] bytes, int[] mgc) {
        return checkBytesImpl.check(bytes, mgc); }
}








