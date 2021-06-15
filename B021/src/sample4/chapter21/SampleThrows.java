package sample4.chapter21;

public class SampleThrows{
    public void method( int value ) throws MyException{
        if( value == 0 ){
            throw new MyException();
        }
    }
}
