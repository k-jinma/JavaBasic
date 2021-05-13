public class B008 {
    public static void main(String[] args) throws Exception {
        Flower flower1 = new Flower();
        flower1.name = "ひまわり";
        flower1.color = "黄色";

        Flower flower2 = new Flower();
        flower2.name = "たんぽぽ";
        flower2.color = "黄色";

        Flower flower3 = new Flower();
        flower3.name = "あじさい";
        flower3.color = "紫";
        
        System.out.println(flower1.name);
        System.out.println(flower1.color);
        System.out.println(flower2.name);
        System.out.println(flower2.color);
        System.out.println(flower3.name);
        System.out.println(flower3.color);

        //商品1のオブジェクト（インスタンス）を生成する
        // Item item1 = new Item();
        // item1.no = 1;
        // item1.name = "商品A";
        // item1.price = 100;
        Item item1 = new Item( 1, "商品A", 100);
        

        int goukei = 0;
        //商品を3つ購入し、50円引きのクーポンを使用して合計金額を取得する
        goukei = item1.goukei(3, 50);
        System.out.println("合計金額：" + goukei + "円");

        //合計金額計算した結果まで表示する
        item1.kingakuDisp(3, 50);
        
        //参照型配列
        Item[] items = { item1, new Item(2, "商品B", 200), new Item("商品C") };
        System.out.println( items[0].name );
        System.out.println( items[1].name );
        System.out.println( items[2].name );
    }

}
