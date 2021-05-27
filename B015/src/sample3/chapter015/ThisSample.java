package sample3.chapter015;

public class ThisSample {
    private String name;
    private int age;
    private String address;

    public ThisSample( String argName) {
        this( argName, -1, null );
        System.out.println("引数を１つ持つコンストラクタ");
    }

    public ThisSample( String argName, int argAge) {
        this( argName, argAge, null );
        System.out.println("引数を２つ持つコンストラクタ");
    }

    public ThisSample ( String argName,  int argAge, String argAddress ) {
        this.name = argName;
        this.age = argAge;
        this.address = argAddress;
        System.out.println("引数を３つ持つコンストラクタ");
    }

    public void disp(){
        System.out.println("名前：" + this.name);
        if( this.age > 0 ){
            System.out.println("年齢：" + this.age);
        }
        if( this.address != null ){
            System.out.println("住所：" + this.address);
        }
        System.out.println();   //改行
    }
}
