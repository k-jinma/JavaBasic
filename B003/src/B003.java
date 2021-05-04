public class B003 {
    public static void main(String[] args) throws Exception {
        int iValue = 10;
        double dValue;
        dValue = iValue;
        System.out.println("拡大変換：int型の" + iValue + "から、double型の" + dValue);
        double ans = 10 * 2.5;
        System.out.println("計算結果は：" + ans + "です。");

        byte bValue;
        bValue = 10;
        System.out.println("リテラルを縮小変換：" + bValue);
        //bValue = 500;   //コンパイルエラー
        System.out.println("リテラルを縮小変換：" + bValue);
        iValue = 20;
        //bValue = iValue;    //コンパイルエラー
        System.out.println("変数のデータを縮小変換：" + bValue);

        byte bValue1 = (byte)20.5;
        System.out.println(bValue1);

        byte bValue2 = (byte)264;
        System.out.println(bValue2);

        dValue = 10.5;
        iValue = (int)dValue;
        System.out.println(iValue); 
    }
}
