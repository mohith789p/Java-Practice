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
    public int[][] SquareArray() {
        int[][] square = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                square[i][j] = arr[i][j] * arr[i][j];
            }
        }
        return square;
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

public class ArraySquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array array = new Array(sc);
        array.createArray();
        int[][] squareArray = array.SquareArray();
        System.out.println("Squared Array: ");
        for (int[] elements : squareArray) {
            for (int element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}