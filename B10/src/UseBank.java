public class UseBank {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        int money = 10000;
        //bank.moneyはprivate修飾子が付与されているため直接アクセスできない
        //bank.money = money;
        System.out.println("振込額:" + money );
        bank.addMoney(money);

        int nowMoney = bank.getMoney();
        System.out.println("現在の所持金：" + nowMoney );

    }
}
