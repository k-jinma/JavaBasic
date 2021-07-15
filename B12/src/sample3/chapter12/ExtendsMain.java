package sample3.chapter12;

public class ExtendsMain {
    public static void main(String[] args) {
        
        Taxi taxi = new Taxi();
        //スーパークラスで定義されているメソッド
        taxi.setData(4, 60);
        taxi.disp();

        //サブクラスで定義されているメソッド
        taxi.setFare(1000);
        taxi.dispFare();

        //スーパークラスで定義されているメソッド
        taxi.run();
        
    }
}
