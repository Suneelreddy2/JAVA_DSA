package Strings;

public class Basics {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world these are the two strings";

        // 1. Length
        System.out.println("s1.length(): " + s1.length());
        System.out.println("s2.length(): " + s2.length());

        // 2. charAt()
        System.out.println("s1.charAt(1): " + s1.charAt(1));

        // 3. concat()
        System.out.println("s1.concat(s2): " + s1.concat(s2));

        // 4. equals()
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        // 5. equalsIgnoreCase()
        System.out.println("s1.equalsIgnoreCase(\"HELLO\"): " + s1.equalsIgnoreCase("HELLO"));

        // 6. compareTo()
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
        // 7. contains()
        System.out.println("s2.contains(\"two\"): " + s2.contains("two"));

        // 8. startsWith() / endsWith()
        System.out.println("s2.startsWith(\"world\"): " + s2.startsWith("world"));
        System.out.println("s2.endsWith(\"strings\"): " + s2.endsWith("strings"));

        // 9. indexOf() / lastIndexOf()
        System.out.println("s2.indexOf(\"e\"): " + s2.indexOf("e"));
        System.out.println("s2.lastIndexOf(\"e\"): " + s2.lastIndexOf("e"));

        // 10. toLowerCase() / toUpperCase()
        System.out.println("s1.toUpperCase(): " + s1.toUpperCase());
        System.out.println("s2.toLowerCase(): " + s2.toLowerCase());

        // 11. substring()
        System.out.println("s2.substring(6): " + s2.substring(6));
        System.out.println("s2.substring(6, 11): " + s2.substring(6, 11));

        // 12. replace()
        System.out.println("s2.replace(\" \", \"-\"): " + s2.replace(" ", "-"));

        // 13. split()
        String[] words = s2.split(" ");
        System.out.println("s2.split(\" \"):");
        for (String word : words) {
            System.out.println(word);
        }

        // 14. trim()
        String s3 = "   spaced string   ";
        System.out.println("Before trim: \"" + s3 + "\"");
        System.out.println("After trim: \"" + s3.trim() + "\"");

        // 15. isEmpty() / isBlank()
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("emptyStr.isEmpty(): " + emptyStr.isEmpty());
        System.out.println("blankStr.isBlank(): " + blankStr.isBlank()); // Java 11+

        // 16. matches()
        System.out.println("s1.matches(\"[a-z]+\")): " + s1.matches("[a-z]+"));

        // 17. repeat()
        System.out.println("s1.repeat(3): " + s1.repeat(3)); // Java 11+
    }
}
