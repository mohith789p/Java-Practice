import java.util.Scanner;

class Array {
    private int column;
    private int row;
    private int[][] arr;
    private Scanner scan;

    Array(Scanner scan) {
        this.scan = scan;
    }

    // intialize array size
    private void setSize() {
        System.out.print("Enter the number of columns: ");
        column = scan.nextInt();
        System.out.print("Enter the number of rows: ");
        row = scan.nextInt();
        arr = new int[row][column];
    }

    // intialize the elements
    private void setValue() {
        System.out.println("Enter the elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
    }

    // create array
    public void createArray() {
        setSize();
        setValue();
    }

    // calculate sum
    public int[][] Arraysum(Array matrix) {
        int[][] sum = new int[row][column];
        int[][] arr2 = matrix.arr;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    // display elements
    public void display() {
        for (int[] a : arr) {
            for (int element : a) {
                System.out.println(element + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array matrix1 = new Array(sc);
        Array matrix2 = new Array(sc);
        matrix1.createArray();
        matrix2.createArray();
        matrix1.display();
        matrix2.display();
        int[][] sumMatrix = matrix1.Arraysum(matrix2);
        System.out.println("SUM Array: ");
        for (int[] elements : sumMatrix) {
            for (int element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}