package ua.step.homework;
import java.util.Scanner;

/**
 * Написать и методы работы с квадратными матрицами (матрицы
 * представить в виде двухмерных массивов).
 * Должны присутствовать методы:
 * • создания единичной (диагональной) матрицы (метод createOne)
 * • создания нулевой матрицы (метод createNull)
 * • сложение матриц (метод sumMatrix)
 * • умножения матриц (метод productMatrix)
 * • умножение матрицы на скаляр (метод productMatrix)
 * • определение детерминанта матрицы (метод determinant)
 * • вывод матрицы на консоль (метод printMatrix)
 */
public class Task01 {

    public static void main(String[] args) {
        int[][] mat = createNull(5,5);
        int[][] one = new int[5][5];
        int[][] two = new int[5][5];
        printMatrix(mat);
        mat = createOne(5,5);
        printMatrix(mat);
        mat = sumMatrix(one, two);
        printMatrix(mat);
        mat = productMatrix(one, two);
        printMatrix(mat);
    }

    /**
     * Создает единичную матрицу
     *  @param n - количество строк
     * @param m - количество колонок
     * @return
     */
    public static int[][] createOne( int n, int m) {
        int[][] arr_one = new int[n][m];
        for (int i = 0; i < arr_one.length; i++) {
            for (int j = 0; j < arr_one.length; j++) {
                if (i==j)
                {
                    arr_one[i][j] = 1;
                }
            }
        }
        return arr_one;
    }



    /**
     * Создает нулевую матрицу
     * @param n - количество строк
     * @param m - количество колонок
     * @return нулевую матрицу
     */

    public static int[][] createNull ( int n, int m){
        int[][] arr = new int[n][m];
        return arr;
    }

    /**
     * Вычисляет сумму двух матриц
     * @param one - первая матрица
     * @param two - вторая матрица
     * @return сумму двух матриц
     */

    public static int[][] sumMatrix ( int[][] one, int[][] two) {
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[i].length; j++) {
                one[i][j] = one[i][j] + two[i][j];
            }
        }
        return one;
    }

    /**
     * Вычисляет произведение двух матриц
     * @param one - первая матрица
     * @param two - вторая матрица
     * @return произведение матриц
     */

    public static int[][] productMatrix ( int[][] one, int[][] two){
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[i].length; j++) {
                    one[i][j] += one[i][j] * two[i][j];
            }
        }
        return one;
    }


    /**
     * Вычисляет произведение матрицы на скаляр
     * @param matrix - матрица
     * @param num - скаляр
     * @return произведение матрицы на скаляр
     */

    public static int[][] productMatrix ( int[][] matrix, int num){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] *= num;
                }

            }
            return matrix;
        }


    /**
     * Вычисляет детерминант матрицы
     * @param matrix - матрица
     * @return детерминант матрицы
     */

    public static int determinant ( int[][] matrix){
        int det = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                det = matrix[i][j] * matrix[i][j];
            }

        }
        return det;
    }


    /**
     * Печатает матрицу в стандартный поток вывода
     * @param matrix - матрица
     */
    public static void printMatrix ( int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
