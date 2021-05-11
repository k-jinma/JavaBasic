package sample.test;

import sample.test2.Util;

public class Main {
    public static void main(String[] args) {
        //sample.test2.Util util = new sample.test2.Util();
        Util util = new Util();
        util.setNo(1);
        util.setName("氏名");
        System.out.println("no:" + util.getNo());
        System.out.println("name" + util.getName());
    }
}
