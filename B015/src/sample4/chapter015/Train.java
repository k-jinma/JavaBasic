package sample4.chapter015;

public class Train {
    private int seat;

    public Train( int seat ){
        this.seat = seat;
    }

    public void disp(){
        System.out.println("普通の席は" + seat + "席あります。");
    }
}
