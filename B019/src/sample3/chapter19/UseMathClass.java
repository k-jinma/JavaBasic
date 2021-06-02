package sample3.chapter19;

public class UseMathClass {
    public static void main(String[] args) {
        double num1 = 9.0;
        double num2 = 2.0;
        double sqrtAns = Math.sqrt(num1);
        double maxAns = Math.max(num1, num2);
        double minAns = Math.min(num1, num2);
        double powAns = Math.pow(num1, num2);

        System.out.println(num1 + "の平方根は" + sqrtAns + "です");
        System.out.println(num1 + "と" + num2 + "で大きいのは" + maxAns + "です");
        System.out.println(num1 + "と" + num2 + "で小さいのは" + minAns + "です");
        System.out.println(num1 + "の" + num2 + "乗は" + powAns + "です");
        
    }
}
