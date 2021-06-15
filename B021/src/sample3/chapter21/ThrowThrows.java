package sample3.chapter21;

public class ThrowThrows {
    public void method( int value ) throws Exception { //Exception例外が発生するメソッド
        if( value == 0 ){
            Exception ex = new Exception("例外発生");
            throw ex;	//Exception例外を発生させる
        }
    }
}
