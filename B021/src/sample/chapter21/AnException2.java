package sample.chapter21;

public class AnException2 {
    public static void main(String[] args) {
        try{
            int[] test;
            test = new int[5];
            test[5] = 80;
            System.out.println("test[5]に80を代入");
            System.out.println("正常終了");

        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("配列の要素を超えています" + e );
            e.printStackTrace();
        }
    }
}
