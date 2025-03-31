
import java.util.Arrays;
import java.util.Scanner;

public class J02102 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n * n];
        for (int i = 0; i < n * n; ++i) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[][] res = new int[n][n];
        int idx = 0;
        int left = 0, right = n - 1, top = 1, bottom = n - 1;
        int check = 1;
        int i = 0, j = 0;
        while(idx < n * n){
            if(check == 1){
                for(; j <= right; ++j){
                    res[i][j] = a[idx++];
                }
                --j;
                ++i;
                for(; i <= bottom; ++i){
                    res[i][j] = a[idx++];
                }
                --i;
                --j;
                --right;
                --bottom;
                check = 0;
            }
            else{
                for(; j >= left; --j){
                    res[i][j] = a[idx++];
                }
                ++j;
                --i;
                for(; i >= top; --i){
                    res[i][j] = a[idx++];
                }
                ++i;
                ++j;
                ++top;
                ++left;
                check = 1;
            }
        }
        for(i = 0; i < n; ++i){
            for(j = 0; j < n; ++j) System.out.print(res[i][j] + " ");
            System.out.println();
        }

    }
}
