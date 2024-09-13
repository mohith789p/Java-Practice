import java.util.Scanner;

class Text {
    private String str;

    Text(String str) {
        this.str = str;
    }

    void reverse() {
        char[] s = str.toCharArray();
        int n = str.length();
        char temp;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        str = new String(s);
    }

    void reverseWords() {
        String[] words = str.split(" ");
        String temp;
        int n = words.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        str = String.join(" ", words);
    }

    void wordReverse() {
        String[] words = str.split(" ");
        for (int k = 0; k < words.length; k++) {
            char[] s = words[k].toCharArray();
            int n = s.length;
            char temp;
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            words[k] = new String(s);
        }
        str = String.join(" ", words);
    }

    void display() {
        System.out.println(str);
    }
}

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        Text obj = new Text(str);
        // obj.reverse();
        // obj.display();
        obj.wordReverse();
        obj.display();
        sc.close();
    }

}
