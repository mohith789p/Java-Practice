import java.util.*;

class Array {
    private int n;
    private int[] arr;
    private Scanner sc;

    // Constructor initializes Scanner
    public Array(Scanner sc) {
        this.sc = sc;
    }

    // Initialize the array by user input
    private void arrayInitialize() {
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
    }

    // store the array
    private void setArray() {
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // creating an array
    public void createArray() {
        arrayInitialize();
        setArray();
    }

    // Displays the array content
    public void displayArray() {
        System.out.println("Array Content: ");
        for (int element : arr) {
            System.out.println(element);
        }
    }

    // finding array maximum
    public int[] arrayMax() {
        int maxVal = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIndex = i;
            }
        }
        return new int[] { maxVal, maxIndex };
    }

    // finding array minimum
    public int[] arrayMin() {
        int minVal = arr[0];
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }
        return new int[] { minVal, minIndex };
    }

    // returns the sum of array
    public int arraySum() {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    // returns the avg of array
    public int arrayAverage() {
        int sum = arraySum();
        return (sum / n);
    }

    // sorting of array
    public void arraySort() {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // search in a array
    public void arraySearch() {
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        boolean exist = false;
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println("Key is found at index " + i);
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("Key is Not found");
        }
    }
}

public class ArrayCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array arr = new Array(sc);
        arr.createArray();
        int[] maximum = arr.arrayMax();
        int[] minimum = arr.arrayMin();
        System.out.println("maximum value: " + maximum[0] + " and index: " + maximum[1]);
        System.out.println("minimum value: " + minimum[0] + " and index: " + minimum[1]);
        sc.close();

    }
}
