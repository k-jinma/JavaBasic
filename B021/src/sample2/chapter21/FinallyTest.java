package sample2.chapter21;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            int[] array = new int[3];
            array[3] = 5;   //ArrayIndexOutOfBoundsExceptionが発生する
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }finally{
            System.out.println("finally");
        }
        System.out.println("Test");
    }
}
