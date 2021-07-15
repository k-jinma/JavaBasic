package sample2.chapter12;

public class Object {
    public static void main(String[] args) {
        Score score1 = new Score();
        score1.data = 1000;
        Score score2 = new Score();
        score2.data = 2000;

        score2 = score1;
        score1.data = 0;

        System.out.println("score1.data:" + score1.data);
        System.out.println("score2.data:" + score2.data);

    }
}
