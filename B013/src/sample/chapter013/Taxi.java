package sample.chapter013;

public class Taxi extends Car {

    public void dispFare(){
        System.out.println("料金を表示する");
    }

    //オーバーライド
    public void run() {
        System.out.println("お客様を乗せて走る");
    }

}
