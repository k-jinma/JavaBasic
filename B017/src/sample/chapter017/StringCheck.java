package sample.chapter017;

public class StringCheck {
    public static void main(String[] args) {
        String str = "";    //入力データと仮定

        if( "".equals(str) ){
            System.out.println("未入力です");
        }

        if( str.length() == 0 ){    //文字列の長さで判定する
            System.out.println("未入力です");
        }

        if( str.isEmpty() ){    //空文字であるか判定するメソッド
            System.out.println("未入力です");
        }
    }
}
