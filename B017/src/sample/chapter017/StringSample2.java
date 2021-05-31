package sample.chapter017;

public class StringSample2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        if ( str1 == str2 ){
            System.out.println("一致");
        }else{
            System.out.println("不一致");
        }

        str1 += "def";
        str2 += "def";

        if ( str1 == str2 ){
            System.out.println("一致");
        }else{
            System.out.println("不一致");
        }

        if ( str1.equals(str2) ){
            System.out.println("一致");
        }else{
            System.out.println("不一致");
        }
    }
}
