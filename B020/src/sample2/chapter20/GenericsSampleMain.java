package sample2.chapter20;

public class GenericsSampleMain {
    public static void main(String[] args) {
        GenericsSample<String> gs = new GenericsSample<String>("DUKE");
        String str = gs.getType();
        System.out.println(str);

    }
}
