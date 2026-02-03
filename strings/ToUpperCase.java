package strings;

public class ToUpperCase {
    public static void main(String[] args) {
        String input = "hello world";
        String output = toUpperCase(input);
        System.out.println(output); // HELLO WORLD
    }

    // Time Complexity: O(n) and Space Complexity: O(n)
    public static String toUpperCase(String s) {
        char[] strChar = s.toCharArray();

        for(int i=0;i<strChar.length;i++){

            if(strChar[i] >= 'a' && strChar[i] <= 'z'){
                strChar[i] = (char)(strChar[i] - 'a' + 'A');
            }
        }

        return new String(strChar);
    }
    
}
