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

    void mergeArray(Array arr1, Array arr2, Array arr) {
        arr.length = arr1.length + arr2.length;
        arr.array = new int[arr.length];
        int i = 0, j = 0;
        for (i = 0; i < arr1.length; i++) {
            arr.array[i] = arr1.array[i];
        }
        for (i = arr1.length, j = 0; j < arr2.length; i++, j++) {
            arr.array[i] = arr2.array[j];
        }
    }

    void displayArray() {
        System.out.println("Array content: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array array1 = new Array(sc);
        Array array2 = new Array(sc);
        Array mergedArray = new Array(sc);
        array1.createArray();
        array2.createArray();
        mergedArray.mergeArray(array1, array2, mergedArray);
        System.out.println("Merged Array: ");
        mergedArray.displayArray();
        sc.close();
    }
}