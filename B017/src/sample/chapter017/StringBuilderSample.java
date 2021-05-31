package sample.chapter017;

public class StringBuilderSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefg");
        sb.reverse();   //文字列を逆順に並び替える
        sb.insert(3, "aaa");    //先頭から3番目に"aaa"を挿入する
        sb.append("zzz");   //"zzz"を文字列の最後に付け加える
        System.out.println("sb = " + sb );

        sb.substring(5);
        System.out.println("sb = " + sb );  //変化しない

        String str = sb.substring(5);   //5文字目以降を抜き出す
        System.out.println("str = " + str );
    }
}
