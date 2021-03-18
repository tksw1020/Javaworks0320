package javastudy1;

public class Works1 {
    public static void main(String[] args) {
        // 九九の配列を宣言
        int anser=res(8,7);
        System.out.println(anser);
    }
        int kuku[][]=new int [9][9];{
        for( int i=0; i<9; i++ ) {
            for( int j=0; j<9; j++ ){
                kuku[i][j] = (i+1) * (j+1);
            }
          }
    } 
    public static int res (int i,int j){
        return i*j;
    }
}

