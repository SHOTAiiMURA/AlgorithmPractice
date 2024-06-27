public class YOKO {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Q1
        //Display five letters "■" side by side.
        for (int i = 0; i < 5; i++){
            System.out.println("■");
        }
        //Q2
        int o = 10;
        for (int i = 0; i < o; i++){
            System.out.println('★');
        }
        //Q3
        //inner loop
        int row = 5;
        int col = 5;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Q6
        //1文字目は「◇」、2文字目は「◆」
        int row2 = 10;
        for (int u = 0; u < row2 ; u++){
            if (u % 2 == 0){
                System.out.print("◇");
            }
            else{
                System.out.print("◆");
            }
        }
        //Q7
        int row3 = 5;
        int col3 = 7;
        for (int f = 0; f < row3; f++){
          for (int g = 0; g < col3; g++){
              if (g % 2 == 0){
                  System.out.print("◆"+" ");
              }
              else{
                  System.out.print(" ");
              }
          }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        // 改行を追加して、次の出力が新しい行から始まるようにします。
        System.out.println();
        //行数に「6」、列数に「10」を指定した場合の実行例は次のとおりです。
        int row4 = 6;
        int col4 = 10;
        for (int k = 0; k < row4; k++){
            int x = k % 2;
            for (int l = 0; l < col4; l++){
                if (l % 2 == x){
                    System.out.print("◆"+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int v = 0; v < 8; v++) {
            for (int b= 0; b < 1+v; b++){
                System.out.print("◆");
            }
            System.out.println();
        }
        for(int a = 0; a < 8  ; a++){
            for(int b = 0; b < 8; b++){
                if(b == 8 - a -1){
                    System.out.print("◆");
                    break;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int a = 1; a < 8  ; a++){
            int multiple = a * 10;
            System.out.println(multiple);
        }
        for(int p = 1; p <= 7  ; p++){
            int multiple2 = p * 5;
            System.out.println(multiple2);
        }
        for(int s = 1; s <= 20 ; s++){
            int multiple3 = s * 4;
            System.out.println(multiple3);
            if(multiple3 == 20){
                break;
            }
        }
        for(int s = 10; s >=1 ; s--){
            System.out.println(s);
        }
        for(int s = 1; s <= 20 ; s++){
            System.out.print(s+","+" ");
        }
        int l = 20;
        for(int k = 1; k <= l ; k++){
            System.out.print(k);
            if(k != l){
                System.out.print(",");
            }

        }
        for(int k = 1; k <= l ; k++){
            if(k % 3 ==0){
                System.out.print("?");
            }
            else{
                System.out.print(k);
            }
            if(k != l){
                System.out.print(",");
            }
        }
        int m = 9;
        for(int d = 1; d <= m ; d++){
            for(int e = 1; e <= m; e++){
                int kuku = e * d;
                System.out.print(kuku);
                System.out.print(',');
            }
            System.out.println();
        }
        //整数型（Javaではint型）5個分の配列を宣言し、利用できるようにしてください。【配列の宣言】
        int[]  array = new int[5];
        //上記の配列に以下の値を代入してください。【配列の利用〜添字指定で代入】
        array[0] = 10;
        array[1] = 25;
        array[2] = 9;
        array[3] = 3;
        array[4] = 15;
        //上記の配列について「0番のデータ」の内容を表示してください。【配列の利用〜添字指定で表示】
        System.out.println(array[0]);
        //上記の配列について「1番のデータ」と「4番のデータ」を足した結果を表示してください。【配列の利用〜添字指定で計算】
        int result = array[1] + array[4];
        System.out.println(result);
        //続けて、新しく上記とは別の配列変数名で整数型（Javaではint型）3個分の配列を宣言し、利用できるようにしてください。ただし、今度は宣言と同時に以下の値が代入されるようにしてください。【配列宣言と同時に初期化】
        int[] array2 = {4,8,12};
        //「１つ目の配列の3番のデータ」と「2つ目の配列の2番のデータ」をかけ算した結果を表示してください。【配列変数名で区別しての利用】
        int result2 = array[3] * array2[2];
        System.out.println(result2);
    }

}
