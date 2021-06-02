package sample.chapter19;

public class Shop {
    static int allShopSales;    //全店売上
    int shopSales;  //店舗売上

    public Shop( int shopSales ){
        allShopSales += shopSales;
        this.shopSales = shopSales;
    }
}
