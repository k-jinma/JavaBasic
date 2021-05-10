class Item {
    int no;         //商品No
    String name;    //商品名
    int price;      //価格

    Item(){

    }

    Item( int no, String name, int price ){
        this.no = no;
        this.name = name;
        this.price = price;
    }

    Item( String name ){
        this.name = name;
    }

    int goukei( int suu ){
        return this.price * suu;
    }

    int goukei( int suu, int discount ){
        return this.price * suu - discount;
    }

    void kingakuDisp( int suu, int discount ) {
        
        int kingaku;
        kingaku = this.price * suu - discount;
        
        System.out.println("合計金額：" + kingaku + "円");

    }

}
