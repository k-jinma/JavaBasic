package sample4.chapter015;

public class ExTrain extends Train{
    private int greenSeat;

    public ExTrain( int seat, int greenSeat){
        super(seat);
        this.greenSeat = greenSeat;
    }

    public void disp(){
        super.disp();
        System.out.println("グリーン席は" + greenSeat + "席あります。");
    }
}
