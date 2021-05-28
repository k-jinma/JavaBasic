package sample3.chapter016;

public class FinalFieldClassMain {
    public static void main(String[] args) {
        FinalFieldClass f = new FinalFieldClass();
        f.noFinalField = 100;
        f.finalField = 1000;    //コンパイルエラー

    }
}
