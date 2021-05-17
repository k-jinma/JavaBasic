package sample3.chapter011;

public class Taxi extends Car {
    private int fare;   //料金

    //料金設定
    public void setFare(int fare){
        this.fare = fare;
    }

    //料金を表示
    public void dispFare(){
        System.out.println("料金は、" + fare + "円");
    }

    //run()メソッドをオーバーライドする
    public void run() {
        System.out.println("お客様を乗せて走る");
    }
    
}
