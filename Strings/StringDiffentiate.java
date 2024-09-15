import java.util.Scanner;

class Text {
    String str;

    Text(String str) {
        this.str = str;
    }

    int[] differentite() {
        char[] ch = str.toCharArray();
        // result[0] lowercase, result[1] uppercase, result[2] digit, result[3] special
        int[] result = { 0, 0, 0, 0 };
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] > 'a' && ch[i] < 'z') {
                result[0]++;
            } else if (ch[i] > 'A' && ch[i] < 'Z') {
                result[1]++;
            } else if (ch[i] > '0' && ch[i] < '9') {
                result[2]++;
            } else {
                result[3]++;
            }
        }
        return result;
    }
}

public class StringDiffentiate {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = read.nextLine();
        Text obj = new Text(str);
        int[] result = obj.differentite();
        System.out.println("LowerCase: " + result[0]);
        System.out.println("UpperCase: " + result[1]);
        System.out.println("Digits: " + result[2]);
        System.out.println("Special Characters: " + result[3]);
    }
}
