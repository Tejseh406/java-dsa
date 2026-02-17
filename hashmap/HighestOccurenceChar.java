package hashmap;

import java.util.HashMap;

public class HighestOccurenceChar {
    
    public static void main(String[] args){
        System.out.println(highestOccuringChar("abcdeapapqarr"));
    }

    public static char highestOccuringChar(String str) {
		HashMap<Character, Integer> hs = new HashMap<>();
		int maxVal = 0;
		char maxChar = 'a';
        char[] chArr = str.toCharArray();

		for(char ch: chArr){

		 hs.put(ch, hs.getOrDefault(ch, 0)+1);

		}

		for(char c: hs.keySet()){
			if(hs.get(c)>maxVal){
				maxVal = hs.get(c);
				maxChar = c;
			}
		}

		return maxChar;
	}
}
