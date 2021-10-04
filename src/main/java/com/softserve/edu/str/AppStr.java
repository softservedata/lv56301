package com.softserve.edu.str;

public class AppStr {
    public static void main(String[] args) {
        /*-
        String str = "I study Java Kava language abc";
        int n = str.indexOf("ava"); // 9
        // int n = str.lastIndexOf("ava"); // 14
        System.out.println("ava n = " + n);
        //
        char c = str.charAt(8); // str[8] not working
        System.out.println("c = " + c);
        n = -1;
        while ((n = str.indexOf("ava", n + 1)) >=0 ) {
            System.out.println("n = " + n);
        }
        //
        String str1 = str.substring(13);     // Kava language abc
        System.out.println("str1 = " + str1);
        str1 = str1.toUpperCase();
        System.out.println("new str1 = " + str1);
        String str2 = str.substring(8, 13);
        System.out.println("str2 = " + str2);
        */
        /*-
        String str = "\t\t   Tabulated String  \t\r\n\n";
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        */
        /*-
        String str = "abracadabra abba";
        System.out.println(str);
        str = str.replace("a", "--");
        //str = str.replaceAll("a\\b", "--"); // \b word boundary
        //str = str.replaceFirst("a", "--");
        //str = str.replaceFirst("b", "--");
        System.out.println(str);
        str = ""; // null
        System.out.println("str.isEmpty() = " + str.isEmpty());
        */
        /*-
        String a0 = "Java"; // equals new String("Java");
        String a1 = "Java"; // set reference
        String a2 = new String("Java"); // create new object
        //
        System.out.println("(a0 == a1) =  " + (a0 == a1)); // true
        System.out.println("(a0 == a2) =  " + (a0 == a2)); // false
        //
        System.out.println("a0.equals(a1) =  " + a0.equals(a1)); // true
        System.out.println("a0.equals(a2) =  " + a0.equals(a2)); // true
        //
        System.out.println("a0.compareTo(a1) =  " + a0.compareTo(a1)); // 0
        System.out.println("a0.compareTo(a2) =  " + a0.compareTo(a2)); // 0
        //
        System.out.println("a0.hashCode() =  " + a0.hashCode());
        System.out.println("a1.hashCode() =  " + a1.hashCode());
        System.out.println("a2.hashCode() =  " + a2.hashCode());
        */
        // /*-
        String a = "a"; // What will be the results?
        String A = "A";
        String b = "a";
        System.out.println("a.equals(A) =  " + a.equals(A)); // false
        System.out.println("a.equals(b) = " + a.equals(b)); // true
        System.out.println("a.equalsIgnoreCase(A) = " + a.equalsIgnoreCase(A)); // true
        System.out.println("a.compareTo(A) = " + a.compareTo(A)); // 32
        System.out.println("a.compareToIgnoreCase(A) = " + a.compareToIgnoreCase(A)); // 0
        // */
    }
}
