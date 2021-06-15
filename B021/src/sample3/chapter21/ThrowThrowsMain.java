package sample3.chapter21;

public class ThrowThrowsMain {
    public static void main(String[] args) {
        ThrowThrows tt = new ThrowThrows();

        try{
            tt.method(0);  //Exception例外が発生しうるメソッドを使用するためtry～catchが必要

        }catch( Exception e ){  //Exception例外が発生した際の処理を記述する
            System.out.println(e);
        }
    }
}
