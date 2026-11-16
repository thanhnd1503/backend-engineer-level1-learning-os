package exercises.module0.step6;

public class Main {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true

        System.out.println(StringCheck.isPalindrome("Level")); // true
        System.out.println(StringCheck.isPalindrome("abc")); // false
        System.out.println(StringCheck.isPalindrome("")); // true
    }

}
