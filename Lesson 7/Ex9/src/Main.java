class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder builder = new StringBuilder();
        for (char i = 'A'; i <= 'Z'; i++) {
            builder.append(i).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder;
    }
}

class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        //write your code here

        System.out.println(builder);//prints A B C D E ...
    }
    public static StringBuilder createEnglishAlphabet() {
        StringBuilder builder = new StringBuilder();
        for (char i = 'A'; i <= 'Z'; i++) {
            builder.append(i).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder;
    }
}