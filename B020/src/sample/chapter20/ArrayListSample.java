package sample.chapter20;

import java.util.*;

public class ArrayListSample {
    public static void main(String[] args) {
        String strValue1 = "Java";
        Integer intValue = 100;
        Double doubleValue = 10.5;
        
        ArrayList array = new ArrayList(20);    //要素数を指定しない場合は10となる

        array.add(strValue1);
        array.add(intValue);
        array.add(doubleValue);

        System.out.println("コレクションに格納されている要素：" + array );
        System.out.println("Index[2]に格納されている要素：" + array.get(2) );
        System.out.println("コレクション内の要素数：" + array.size() );

        array.remove(0);
        System.out.println("コレクション内の要素数：" + array.size() );
        System.out.println("Index[0]に格納されている要素：" + array.get(0));
        System.out.println("Index[1]に格納されている要素：" + array.get(1));
        System.out.println("Index[2]に格納されている要素：" + array.get(2));

    }
}
