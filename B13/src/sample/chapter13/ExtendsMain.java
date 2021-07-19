package sample.chapter13;

public class ExtendsMain {
    public static void main(String[] args) {
        
        Taxi taxi = new Taxi();
        //スーパークラスで定義されているメソッド
        taxi.setData(4, 60);
        taxi.disp();

        //サブクラスで追加定義されているメソッド
        taxi.setFare(1000);
        taxi.dispFare();

        //スーパークラスの抽象メソッドがサブクラスでオーバーライドされて実装されたメソッド
        taxi.run();
        
    }
}
