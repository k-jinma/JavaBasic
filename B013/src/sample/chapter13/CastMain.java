package sample.chapter13;

public class CastMain {
    public static void main(String[] args) {
        Car car = new Taxi();
        car.run();

        //実行できそうだができない
        // car.dispFare();

        //エラーとなる
        // Taxi taxi = car;
        
        //キャストを使用してダウンキャストするとエラーにならない
        // Taxi taxi = (Taxi)car;
        // taxi.run();
        // taxi.dispFare();

        // Taxi t = new Taxi();
        // Car c = new Car();
        // if(c instanceof Taxi){
        //     System.out.println("TaxiにCarをキャストできます");
        //     t = (Taxi)c;
        // }else{
        //     System.out.println("TaxiにCarをキャストできません");
        // }
    }

}