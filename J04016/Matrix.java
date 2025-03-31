package J04016;

import java.util.Scanner;

public class Matrix {

    private int[][] matrix;

    private int rows, cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public Matrix(int[][] matrix) {
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        this.matrix = matrix;
    }

    public void nextMatrix(Scanner scanner){
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j) matrix[i][j] = scanner.nextInt();
        }
    }

    public Matrix mul(Matrix o){
        int[][] newMat = new int[this.rows][o.cols];
        for(int i = 0; i < this.rows; ++i){
            for(int j = 0; j < o.cols; ++j){
                newMat[i][j] = 0;
                for(int k = 0; k < this.cols; ++k){
                    newMat[i][j] += matrix[i][k] * o.matrix[k][j];
                }
            }
        }
        return new Matrix(newMat);
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j) res.append(matrix[i][j]).append(" ");
            res.append("\n");
        }
        return res.toString();
    }
}
