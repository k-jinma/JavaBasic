package sample4.chapter21;

public class OriginalExceptionSample2 {
    public static void main(String[] args) {
        SampleThrows st = new SampleThrows();

        try {
            st.method(0);

        } catch (MyException e) {
            System.out.println(e);
        
        }
        
    }
}
