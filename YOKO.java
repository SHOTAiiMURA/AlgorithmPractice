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
    }

}
