// package 13Methods;

public class Inbuilt {
    public static void main(String[] args) {
        //String Methods
        String str = "Hello, World!";
        int length = str.length();
        String upperCaseStr = str.toUpperCase();
        String lowerCaseStr = str.toLowerCase();
        String replacedStr = str.replace("World", "Java");
        String substringStr = str.substring(7, 12);
        
        System.out.println("Original String: " + str);
        System.out.println("Length: " + length);
        System.out.println("Upper Case: " + upperCaseStr);
        System.out.println("Lower Case: " + lowerCaseStr);
        System.out.println("Replaced String: " + replacedStr);
        System.out.println("Substring: " + substringStr);

        //int Methods
        int a = 5;
        int b=8;
        System.out.println("max of a and b is: " + Math.max(a, b));
        System.out.println("min of a and b is: " + Math.min(a, b));
        System.out.println("sqrt of a :"+ String.format("%.2f", Math.sqrt(a))+" sqrt of b:"+Math.sqrt(b));
        



    }
    
}
