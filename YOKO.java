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
        
    }
}
