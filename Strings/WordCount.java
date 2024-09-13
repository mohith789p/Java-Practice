import java.util.Scanner;

class Count {
    private String str;

    Count(String str) {
        this.str = str;
    }

    public int length() {
        int count = 0;
        for (String s : str.split(" ")) {
            count++;
        }
        return count;
    }
}
public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        Count size = new Count(str);
        System.out.println(size.length());
        sc.close();
    }
}
