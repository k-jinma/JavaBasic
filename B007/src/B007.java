public class B007 {
    public static void main(String[] args) throws Exception {
        int price = Integer.parseInt(args[0]);
        int tax = Integer.parseInt(args[1]);

        System.out.println("税込み価格：" + (price + tax) + "円");

    }
}
