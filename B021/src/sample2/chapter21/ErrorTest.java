package sample2.chapter21;

public class ErrorTest {
    public static void main(String[] args) {
        try {
            System.out.println("test");
        }catch ( RuntimeException e){
            System.out.println("RuntimeException");
        }catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("例外処理終了");
    }
}
