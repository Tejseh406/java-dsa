package strings;

public class ToLowerCase {
    public static void main(String[] args) {
        String input = "HELLO WORLD";
        String output = toLowerCase(input);
        System.out.println(output); // hello world
    }

    // Time Complexity: O(n) and Space Complexity: O(n)
    public static String toLowerCase(String s) {  
        char[] strChar = s.toCharArray();

        for(int i=0;i<strChar.length;i++){

            if(strChar[i] >= 'A' && strChar[i] <= 'Z'){
                strChar[i] = (char)(strChar[i] - 'A' + 'a');
            }
        }

        return new String(strChar);
    }
}
