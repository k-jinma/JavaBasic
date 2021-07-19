package sample.chapter13;

public abstract class AbstractCar {
    private int fuel;   //燃料
    private int speed;  //スピード

    //データ設定
    public void setData( int fuel, int speed ){
        this.fuel = fuel;
        this.speed = speed;
    }

    //燃料、速度表示
    public void disp(){
        System.out.println("燃料は、" + fuel + "リットル");
        System.out.println("スピードは、" + speed + "km");
    }

    //サブクラスでオーバーライドして利用する抽象メソッド
    public abstract void run();

}
