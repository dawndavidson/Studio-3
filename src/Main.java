import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String inputStr = input.nextLine();
        String lowerInput = inputStr.toLowerCase();
        char[] charInString = lowerInput.toCharArray();
        String allowableChar = "a-z";

        //String inputStr = " Java is fun to learn!";
        //char[] charInString = inputStr.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char letter : charInString) {

            if(charCount.containsKey(letter)){
                charCount.put(letter, charCount.get(letter)+ 1);
            }
            else {
                charCount.put(letter,1);
            }
        }
        for(Map.Entry<Character, Integer> printChar : charCount.entrySet()){
            System.out.println(printChar.getKey() + " : " + printChar.getValue());
        }
	// write your code here
    }
}
