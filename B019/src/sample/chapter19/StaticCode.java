package sample.chapter19;

public class StaticCode {
    public static void main(String[] args) {
        Shop shop1 = new Shop(100);
        System.out.println("クラス変数：" + Shop.allShopSales);
        System.out.println("インスタンス変数：" + shop1.shopSales);

        Shop shop2 = new Shop(300);
        System.out.println("クラス変数：" + Shop.allShopSales);
        System.out.println("インスタンス変数：" + shop2.shopSales);
    }
}
