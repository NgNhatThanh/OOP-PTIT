import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class J07076 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("MATRIX.in"));
        int t = cin.nextInt();
        while(t-- > 0){
            int n = cin.nextInt();
            int m = cin.nextInt();
            int col = cin.nextInt();
            int[][] arr = new int[n][m];
            for(int i = 0; i < n; ++i){
                for(int j = 0; j < m; ++j){
                    arr[i][j] = cin.nextInt();
                }
            }
            --col;
            for(int i = 0; i < n; ++i){
                for(int j = i + 1; j < n; ++j){
                    if(arr[j][col] < arr[i][col]){
                        int tmp = arr[i][col];
                        arr[i][col] = arr[j][col];
                        arr[j][col] = tmp;
                    }
                }
            }
            for(int i = 0; i < n; ++i){
                for(int j = 0; j < m; ++j){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
