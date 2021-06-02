package sample4.chapter19;

public class Initialization {
    static int staticNum;
    int num;

    static {
        staticNum = 10;
        System.out.println("staticイニシャライザ");
    }

    public Initialization(){
        num = 10;
        System.out.println("コンストラクタ");
    }

    public static void main(String[] args) {
        System.out.println("main()メソッド開始");
        System.out.println("static変数 staticNum :" + Initialization.staticNum);
        Initialization ini = new Initialization();
        System.out.println("インスタンス変数 num :" + ini.num);
    }
}
