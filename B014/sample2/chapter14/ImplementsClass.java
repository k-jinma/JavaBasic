package sample2.chapter14;

public class ImplementsClass implements IfSample3{

    @Override
    public void push() {
        System.out.println("called push method!");
        
    }

    @Override
    public void pull() {
        System.out.println("called pull method!");
        
    }

    @Override
    public void turn() {
        System.out.println("called turn method!");
        
    }
    
}
