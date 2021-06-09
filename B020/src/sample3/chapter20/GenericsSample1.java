package sample3.chapter20;

import java.util.ArrayList;

public class GenericsSample1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Hello");
        array.add("Java");
        array.add("World");
        
        for(String strValue : array){
            System.out.println(strValue.length());
        }

        ArrayList<Integer> array2 = new ArrayList<>();  // ダイヤモンド演算子を使用した定義の簡略形


    }
}
