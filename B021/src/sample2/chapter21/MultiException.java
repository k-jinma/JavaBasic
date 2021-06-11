package sample2.chapter21;

public class MultiException {
    public static void main(String[] args) {
        String tmp = null;
        int value = 0;
        try {
            if( args.length < 1 ){
                value = tmp.length();   //tmpの中身はnull
            }else{
                value = Integer.parseInt(args[0]);
                System.out.println("入力データは：" + value + "です。");
            }
            
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("NullPointerException OR NumberFormatException ERROR!");
        }

    }
}
