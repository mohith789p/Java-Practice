import java.util.Scanner;

class occurenceCount {
    private String str;

    occurenceCount(String str) {
        this.str = str;
    }

    int count(char ch) {
        int i = 0;
        for (char s : str.toCharArray()) {
            if (ch == s) {
                i++;
            }
        }
        return i;
    }

}

public class occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        occurenceCount obj = new occurenceCount(str);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        int repeat = obj.count(ch);
        System.out.println("Occurence: " + repeat);
        sc.close();
    }

}
