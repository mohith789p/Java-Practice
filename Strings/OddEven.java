import java.util.Scanner;

class Term {
    String str;
    int num;
    String[] words;
    String[] even;
    String[] odd;

    Term(String str) {
        this.str = str;
        words = str.split(" ");
        num = words.length;
    }

    void separate() {
        even = new String[(num + 1) / 2];
        odd = new String[num / 2];
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                even[i / 2] = words[i];
            } else {
                odd[(i - 1) / 2] = words[i];
            }
        }
    }

    void display(String[] s) {
        for (String word : s) {
            if (word != null) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}

public class OddEven {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = read.nextLine();
        Term obj = new Term(str);
        obj.separate();
        System.out.println("Words: ");
        obj.display(obj.words);
        System.out.println("Even Position: ");
        obj.display(obj.even);
        System.out.println("Odd Position: ");
        obj.display(obj.odd);
        read.close();
    }
}
