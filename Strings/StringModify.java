
/* Change odd indexes to uppercase and Reverse the even indexes*/
import java.util.Scanner;

class Text {
    private String str;

    Text(String str) {
        this.str = str;
    }

    void modify() {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) {
                words[i] = reverse(words[i]);
            } else {
                words[i] = words[i].toString().toUpperCase();
            }
        }
        str = String.join(" ", words);
    }

    String reverse(String st) {
        char[] s = st.toCharArray();
        int n = s.length;
        char temp;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return new String(s);
    }

    void display() {
        System.out.println(str);
    }
}

public class StringModify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        Text obj = new Text(str);
        obj.modify();
        obj.display();
        sc.close();
    }

}
