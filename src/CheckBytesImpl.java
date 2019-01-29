import java.util.Arrays;
public class CheckBytesImpl implements CheckBytes {
    public boolean check(int[] x, int[] y) {
        return Arrays.equals(x,y);
    }}