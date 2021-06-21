public class B03 {
    public static void main(String[] args) throws Exception {
        int countNum = 10;
        System.out.println(countNum);

        int countNum2;
        countNum2 = 20;
        System.out.println(countNum2);

        countNum = countNum2;
        System.out.println(countNum);
        
        int value1, value2, ans;
        value1 = 10;
        value2 = 5;
        ans = value1 + value2;  //加算
        System.out.println("加算=>" + ans );
        ans = value1 - value2;  //減算
        System.out.println("減算=>" + ans );
        ans = value1 * value2;  //乗算
        System.out.println("乗算=>" + ans );
        ans = value1 / value2;  //除算
        System.out.println("除算=>" + ans );
        ans = value1 % value2;  //剰余残
        System.out.println("剰余残=>" + ans );

        value1++;   //インクリメント
        value2--;   //デクリメント
        System.out.println("インクリメント=>" + value1);
        System.out.println("デクリメント=>" + value2);

        value1 = 10;
        value2 = 10;
        ans = value1++;
        System.out.println(ans);
        ans = ++value2;
        System.out.println(ans);
        

    }
}
