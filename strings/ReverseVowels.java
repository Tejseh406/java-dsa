package strings;
public class ReverseVowels {
    
    public static void main(String[] args) {
        String input = "hello world";
        String output = reverseVowels(input);
        System.out.println(output); // hollo werld
    }

    // Two pointer approach
    // Time Complexity: O(n) and Space Complexity: O(n)
    public static String reverseVowels(String s){
        int left = 0, right = s.length() - 1;
        char[] strChars = s.toCharArray();

        
        while(left < right){
            while(left < right && !isVowel(strChars[left])){
                left++;
            }
            while(left < right && !isVowel(strChars[right])){
                right--;
            }
                char temp = strChars[left];
                strChars[left] = strChars[right];
                strChars[right] = temp;
                left++;
                right--;
        }

        return new String(strChars);
    }

    public static boolean isVowel(char c){
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }

}
