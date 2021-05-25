package sample.chapter013;

public class Bus extends Car{
    
    //オーバーライド
    public void run(){
        System.out.println("停留所に止まりながら走る");
    }

    public void announce(){
        System.out.println("アナウンスする");
    }

}
