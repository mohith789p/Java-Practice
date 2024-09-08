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

    // common elements
    public void commonArrayElements(Array array) {
        int[][] arr2 = array.arr;
        System.out.println("Common Elements: ");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                for (int k = 0; k < array.row; k++) {
                    for (int l = 0; l < array.column; l++) {
                        if (arr[i][j] == arr2[k][l]) {
                            System.out.print(arr[i][j] + " ");
                            break;
                        }
                    }
                }
            }
        }
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

public class ArrayCommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array array1 = new Array(sc);
        Array array2 = new Array(sc);
        array1.createArray();
        array2.createArray();
        array1.commonArrayElements(array2);
    }
}