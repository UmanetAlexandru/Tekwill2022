public class MyString implements ReversedString {
    private final String str;

    public MyString(String str) {
        this.str = str;
    }

//    @Override
//    public String get() {
//        StringBuilder result = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            result.append(str.charAt(i));
//        }
//        return result.toString();
//    }

    @Override
    public String reverse() {
        return new StringBuilder(str).reverse().toString();
    }
}
