import java.util.HashMap;

/**
 * Created by apandian on 6/6/2017.
 */
public class Anagram {
    public static void main(String[] args) {
        System.out.println(Level1("Hello", "lloeH"));
    }

    public static boolean Level1(String input1, String input2){
        // O(2N)
        // Big O for charAt(i) is O(1)
        HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();
        for(int i = 0; i < input1.length(); i++){
            if(characterCount.containsKey(input1.charAt(i))){
                characterCount.put(input1.charAt(i), characterCount.get(input1.charAt(i)) + 1);
            }
            else{
                characterCount.put(input1.charAt(i),1);
            }
        }

        for(int i=0; i <input2.length();i++){
            if(characterCount.containsKey(input2.charAt(i))){
                if(characterCount.get(input2.charAt(i)) > 1) {
                    characterCount.put(input2.charAt(i), characterCount.get(input2.charAt(i)) -1);
                }
                else{
                    characterCount.remove(input2.charAt(i));
                }
            }

        }

        if(characterCount.size() > 0)
            return false;
        else
            return true;
    }
}
