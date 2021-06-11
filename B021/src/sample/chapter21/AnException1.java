package sample.chapter21;
public class AnException1 {
    public static void main(String[] args) {
        int[] test;
        test = new int[5];
        test[5] = 80;
        System.out.println("test[5]に80を代入");
        System.out.println("正常終了");
    }
}
