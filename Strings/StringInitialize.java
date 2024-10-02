public class StringInitialize {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = new String("Hello");

        // "Hello" of str1 and str3 are same (points to same address where 'Hello' is
        // present)
        // "Hello" of str2 and str4 are different (creates new object in heap)

        System.out.println("String 1: " + str1); // direct
        System.out.println("String 2: " + str2); // object
        System.out.println("String 3: " + str3); // direct
        System.out.println("String 4: " + str4); // object
        System.out.println("checking String 1 & 2: " + (str1 == str2));
        System.out.println("checking String 1 & 3: " + (str1 == str3));
        System.out.println("checking String 2 & 4: " + (str2 == str4)); // '==' check the address
        System.out.println("checking String 1 & 2 (equals): " + (str1.equals(str2))); // equals check the value
    }
}
