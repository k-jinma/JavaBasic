public class B07 {
    public static void main(String[] args) throws Exception {
        int japaneseScore = 70;
        int englishScore = 90;
        int mathScore = 85;
        System.out.println(japaneseScore);
        System.out.println(englishScore);
        System.out.println(mathScore);

        //配列の宣言
        int [] seiseki;
        
        //要素数の確保
        seiseki = new int[3];
        //int[] seiseki = new int[3];

        //配列への代入
        seiseki[0] = 70;
        seiseki[1] = 90;
        seiseki[2] = 85;

        System.out.println("国語の成績は" + seiseki[0] + "点");
        System.out.println("英語の成績は" + seiseki[1] + "点");
        System.out.println("数学の成績は" + seiseki[2] + "点");

        //配列の初期化と要素数の取得
        int[] no = new int[] {70, 90, 85};
        System.out.println(no[0]);
        System.out.println(no[1]);
        System.out.println(no[2]);

        System.out.println("全科目数は" + no.length + "科目です");

        //繰り返し文と配列
        int goukei = 0;
        for( int i = 0; i < seiseki.length; i++ ){
            goukei += seiseki[i];
        }
        System.out.println("科目の合計点は" + goukei + "点です");

        //2次元配列
        int[][] multiArray = new int[3][3];
        multiArray[0][0] = 10;
        multiArray[0][1] = 20;
        multiArray[0][2] = 30;
        multiArray[1][0] = 40;

        //3次元配列
        int[][][] tripleArray = new int[3][3][3];
        tripleArray[0][0][0] = 10;
        tripleArray[0][0][1] = 20;
        tripleArray[1][0][0] = 30;
        tripleArray[2][0][1] = 40;

        int[][] array = { {0, 1}, {2, 3, 4, 5}, {6, 7, 8} }; 
        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
        System.out.println(array[2].length);

        //拡張for文
        String[] animals = {"dog", "cat", "fish"};
        for( String str : animals ){
            System.out.println("kind of pet : " + str);
        }

    }
}
