public class StringMethod {
    public static void main(String[] args) {
        String emp = "     ";
        String str = "Hello, World!";
        String str1 = " Hello, World!   ";
        System.out.println(str);
        System.out.println(emp.isEmpty()); // to check if string is empty or not
        System.out.println(emp.isBlank()); // to check if value of string is empty or not
        System.out.println(str.startsWith("Hell")); // to check if string starts with given letter or not
        System.out.println(str.endsWith("orld")); // to check if string ends with given letter or not
        System.out.println(str.contains("Wo")); // to check the it contains the given substring or not
        System.out.println(str.equals(str1.trim())); // to check two string are equal or not
        System.out.println(str.equalsIgnoreCase(str.toLowerCase())); // to check two string are equal irrespective of their case
        System.out.println(str.equalsIgnoreCase(str.toUpperCase())); // to check two string are equal irrespective of their case
    }
}