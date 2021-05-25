package sample.chapter013;

public class CastMain2 {
    public static void main(String[] args) {
        Car[] carList = {new Taxi(), new Bus()};
        for(Car car : carList){
            car.run();
        }

        System.out.println();

        //固有のサブクラスの機能を使いたい場合
        Taxi taxi = (Taxi)carList[0];
        taxi.dispFare();

        Bus bus = (Bus)carList[1];
        bus.announce();

    }
}
