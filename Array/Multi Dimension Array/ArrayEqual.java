
/* Replacing equal elements with one and remaing are 0 */
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

    // equality to 1 and not to 0
    public int[][] equalArray(Array array) {
        int[][] equal = new int[row][column];
        int[][] arr2 = array.arr;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == arr2[i][j]) {
                    equal[i][j] = 1;
                } else {
                    equal[i][j] = 0;
                }
            }
        }
        return equal;
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

public class ArrayEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array array1 = new Array(sc);
        Array array2 = new Array(sc);
        array1.createArray();
        array2.createArray();
        int[][] equal = array1.equalArray(array2);
        for (int[] elements : equal) {
            for (int element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}