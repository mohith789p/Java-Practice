import java.util.Scanner;

class Array {
    private int length;
    private int[] array;
    private Scanner scan;

    Array(Scanner scan) {
        this.scan = scan;
    }

    void createArray() {
        System.out.print("Enter the no. of elements: ");
        length = scan.nextInt();
        array = new int[length];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
    }

    void mergeArray(Array arr1, Array arr2) {
        this.length = arr1.length + arr2.length;
        this.array = new int[this.length];
        int i = 0, j = 0;
        for (i = 0; i < arr1.length; i++) {
            this.array[i] = arr1.array[i];
        }
        for (i = arr1.length, j = 0; j < arr2.length; i++, j++) {
            this.array[i] = arr2.array[j];
        }
    }

    void reverseArray() {
        int i, temp;
        for (i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }

    void displayArray() {
        System.out.println("Array content: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array array = new Array(sc);
        array.createArray();
        array.reverseArray();
        array.displayArray();
        sc.close();
    }
}