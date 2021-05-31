package sample.chapter017;

public class StringSample {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = str1;
        str1 += " more words";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
