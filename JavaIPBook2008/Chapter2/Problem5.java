public class Problem5 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        Object obj = str1 + " " + str2;

        String greeting = obj.toString();

        System.out.println(greeting);
    }
}
