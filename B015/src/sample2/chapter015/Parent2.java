package sample2.chapter015;

public class Parent2 {

    // 引数付きのコンストラクタを定義すると、デフォルトコンストラクタは自動生成されない
    // public Parent2() {
    //     super();
    // }

    public Parent2( int value ) {
        System.out.println( value );
    }
}
