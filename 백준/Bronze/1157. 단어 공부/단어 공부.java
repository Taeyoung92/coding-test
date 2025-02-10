import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();
        
        int[] wordArr = new int[26];
        
        for(int i=0; i<word.length(); i++) {
            wordArr[word.charAt(i) - 'A']++;
        }
        
        int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (wordArr[i] > max) {
				max = wordArr[i];
				ch = (char)(i+'A');
			}
			else if (wordArr[i] == max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
    }
}
