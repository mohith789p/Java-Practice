import java.util.Scanner;

class Array {
    private int column;
    private int row;
    private int[][] arr;
    private Scanner scan;

    Array(Scanner scan) {
        this.scan = scan;
    }

    // intialize length
    private void setDimensions() {
        System.out.print("Enter the number of rows: ");
        row = scan.nextInt();
        System.out.print("Enter the number of columns: ");
        column = scan.nextInt();
        arr = new int[row][column];
    }

    // intialize values
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
        setDimensions();
        setValue();
    }

    // sum of all elements
    public int arraySum() {
        int sum = 0;
        for (int[] a : arr) {
            for (int element : a) {
                sum += element;
            }
        }
        return sum;
    }

    // sum of row elements
    public int[] rowSum() {
        int sum[] = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i] += arr[i][j];
            }
        }

        return sum;
    }

    // sum of column elements
    public int[] columnSum() {
        int sum[] = new int[column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[j] += arr[i][j];
            }
        }

        return sum;
    }

    // display elements
    public void display() {
        System.out.println("Array content: ");
        for (int[] a : arr) {
            for (int element : a) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array(scanner);

        array.createArray();
        array.display();

        System.out.println("Sum: " + array.arraySum());
        int[] row = array.rowSum();
        System.out.println("Row sum: ");
        for (int element : row) {
            System.out.print(element + " ");
        }

        System.out.println();

        int[] column = array.columnSum();
        System.out.println("Column sum: ");
        for (int element : column) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}