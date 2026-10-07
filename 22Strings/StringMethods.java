
public class StringMethods {
    public static void main(String args[]){
        String str1="Prajwal";
        String str2="Prajwal";
        String str3=new String("Prajwal");
        String str4=new String("Prajwal");
        String str5="  Prajwal Reddy ";
        System.out.println(str1==str2);
        System.out.println(str3==str4);
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));
        System.out.println(str1.length());
        System.out.println(str1.charAt(0));
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.substring(0,4));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str5.trim()); //removes the leading and trailing spaces
        System.out.println(str5.startsWith("  "));
        System.out.println(str5.endsWith("ddy "));
        System.out.println(str5.replace("Prajwal", "Reddy"));
        System.out.println(str5.replaceAll(" ", ""));
        System.out.println(str5.replaceFirst(" ", ""));
        System.out.println(str1.split(" ")[0]); //splits the string into an array of strings based on the delimiter and returns the first element
        System.out.println(str1.concat("Reddy"));
        System.out.println(str1.compareTo(str2)); //returns 0 if both strings are equal
        System.out.println(str1.contains("Prajwal"));

    }
}