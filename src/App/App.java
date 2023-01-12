package App;

class callClass {
    void methodTest() {
        System.out.println("calledMethodTest");
    }
}

//別クラス




public class App {
    public static void main(String[] args) throws Exception {
        //コメント
        int a = 45;
        int b = 50;
        String c = "a+bは";
        int ar = 4;
        System.out.println(c+(a+b));

        int array[] = {11,22,33,44,55};
        System.out.println(array[0]);
        if (array[ar] >= a) {
            System.out.println("aよりar0のほうが大木");
        }else {
            System.out.println(a);
        }

        //while文
        int i = 0;
        while (i<10) {
            System.out.println("i = "+i);
            i++;
        }
        //continue
        for(int ii = 0; ii<=10;ii++) {
            if(ii==5) {
                System.out.println(ii+"は飛ばします");
                continue;
            }
        System.out.println(ii);
        }

        //オブジェクト生成
        callClass another = new callClass();
        //めそっど呼び出し
        another.methodTest();

        //addメソッド
        int result = add(4, 5);
        System.out.println(result+"addメソッドの結果");
        }

         //引数1と引数2を足した数を表示する関数(メソッド)
        public static int add(int x, int y) {
            return x+y;
        }

        }
    
    

