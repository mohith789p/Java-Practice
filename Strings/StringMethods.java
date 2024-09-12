import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";
        System.out.println(str);
        System.out.println(str.length()); // to find length
        System.out.println(str.trim()); // to clear spaces starting and ending of the string
        str = str.trim();
        System.out.println(str.toCharArray()); // convert string to char array
        System.out.println(str.toLowerCase()); // convert string to lower case
        System.out.println(str.toUpperCase()); // convert string to upper case
        System.out.println(str.indexOf("wo")); // return the index
        System.out.println(str.lastIndexOf('l')); // return the index of last occurrence of the character
        System.out.println(str.substring(2, 6)); // return the substring
        // to print array converted into string
        System.out.println(Arrays.toString(str.split(" "))); // split by space into array
        System.out.println(str.charAt(9)); // return the character at the index
        System.out.println(str.replace('o', 'z')); // replace the character
        System.out.println(str.replaceAll("world", "my boy")); // replace all occurrences of the string
    }
}