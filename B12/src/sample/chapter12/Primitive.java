package sample.chapter12;

public class Primitive {
    public static void main(String[] args) {
        int data1 = 1000;
        int data2 = data1;

        System.out.println("data1:" + data1);
        System.out.println("data2:" + data2);
        
        data1 = 0;
        System.out.println("data1:" + data1);
        System.out.println("data2:" + data2);

    }
}
