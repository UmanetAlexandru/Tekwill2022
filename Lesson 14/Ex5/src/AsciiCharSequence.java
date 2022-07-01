import java.util.*;

public class AsciiCharSequence implements CharSequence {
    private final byte[] arr;

    public AsciiCharSequence(byte[] arr) {
        this.arr = arr;
    }

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] copy = Arrays.copyOfRange(arr, start, end);
        return new AsciiCharSequence(copy);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (byte b : arr) {
            result.append((char) b);
        }
        return result.toString();
    }
}