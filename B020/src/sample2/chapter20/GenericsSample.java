package sample2.chapter20;

public class GenericsSample<T> {
    private T type;

    public GenericsSample( T type ){
        this.type = type;
    }

    public T getType(){
        return type;
    }
}
