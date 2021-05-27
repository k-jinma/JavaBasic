package sample3.chapter015;

public class ConstractorTest3 {
    public static void main(String[] args) {
        ThisSample human1 = new ThisSample("高橋玲子");
        human1.disp();
        ThisSample human2 = new ThisSample("山本太郎", 25);
        human2.disp();
        ThisSample human3 = new ThisSample("田中理恵", 30, "東京都");
        human3.disp();

    }
}
