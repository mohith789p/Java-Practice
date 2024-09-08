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

    // interchanging rows and columns
    public int[][] interchangeArray() {
        int[][] interchange = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                interchange[j][i] = arr[i][j];
            }
        }
        return interchange;
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

public class ArrayInterchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array array = new Array(sc);
        array.createArray();
        int[][] interchangedArray = array.interchangeArray();
        System.out.println("Squared Array: ");
        for (int[] elements : interchangedArray) {
            for (int element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}