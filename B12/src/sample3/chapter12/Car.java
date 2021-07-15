package sample3.chapter12;

public class Car {
    private int fuel;   //燃料
    private int speed;  //速度

    //データ設定
    public void setData( int fuel, int speed ){
        this.fuel = fuel;
        this.speed = speed;
    }

    //燃料と速度を表示する
    public void disp(){
        System.out.println("燃料は、" + fuel + "リットル");
        System.out.println("速度は、" + speed + "km");
    }

    //走る
    public void run(){
        System.out.println("走る");
    }
}
