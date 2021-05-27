package sample2.chapter015;

public class Child2 extends Parent2 {
    public Child2() {
        super(4);   // super();が自動的に呼び出されないように、手動で親のコンストラクタを呼び出す
        System.out.println("Child2");
    }
}
