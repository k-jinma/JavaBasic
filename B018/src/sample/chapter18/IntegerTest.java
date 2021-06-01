package sample.chapter18;

public class IntegerTest {
    public static void main(String[] args) {
        int num = 3;
        // Integer integerNum = new Integer(num);  //Java9より非推奨（パフォーマンスの向上）
        Integer integerNum = Integer.valueOf(num);
        double doubleNum = integerNum.doubleValue();
        System.out.println(doubleNum);
    }
}
