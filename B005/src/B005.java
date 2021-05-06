public class B005 {
    public static void main(String[] args) throws Exception {
        //「while文」
        int i = 1;
        while(i <= 3){
            System.out.println(i);
            i++;
        }

        int max = 10;
        int num = 1;
        int sum= 0;
        while(num <= max){
            sum += num;
            num++;
        }
        System.out.println("1～" + max + "までの合計は" + sum + "です");

        //do-while文
        int j = 1;
        do {
            System.out.println(j + "回繰り返し");
            j++;
        } while (j <= 5);

        //for文
        for(i = 1; i <= 5; i++){
            System.out.println(i + "回繰り返し");
        }

        //for文のネスト
        for(i = 0; i < 2; i++){
            for(j = 0; j < 3; j++){
                System.out.println("i = " + i + " j = " + j);
            }
        }

        //break文とcontinue文
        for(i = 0; i < 4; i++){
            if( i == 1 ){
                System.out.println("continue");
                continue;
            }else if( i == 3 ){
                System.out.println("break");
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
