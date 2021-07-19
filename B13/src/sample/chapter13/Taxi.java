package sample.chapter13;

public class Taxi extends AbstractCar{
    private int fare;   //料金

    //料金設定 ※サブクラスで追加したメソッド
    public void setFare( int fare ){
        this.fare = fare;
    }

    //料金を表示　※サブクラスで追加したメソッド
    public void dispFare(){
        System.out.println("料金は、" + fare + "円");
    }

    //run()メソッドのオーバーライド
    public void run() {
        System.out.println("お客様を乗せて走る");
    }
    
}
