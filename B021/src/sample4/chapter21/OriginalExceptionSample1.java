package sample4.chapter21;

public class OriginalExceptionSample1 {
    public static void main(String[] args) {
        MyException me = new MyException("独自の例外");
        try {
            throw me;
            
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
