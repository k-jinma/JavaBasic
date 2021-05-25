package sample.chapter14;

public class InterfaceMain {
    public static void main(String[] args) {
        System.out.println(Button.size);
        Button btn = new ButtonSave();
        btn.push();

        btn = new ButtonClose();
        btn.push();
    }
    
}
