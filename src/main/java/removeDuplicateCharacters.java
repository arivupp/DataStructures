import java.util.HashSet;

/**
 * Created by apandian on 6/6/2017.
 */
public class removeDuplicateCharacters {
    public static void main(String[] args) {
        System.out.println(Level2("Hello"));
    }

    public static String Level1(String input){
        // The complexity of substring is O(N). For this method the Big O might be O(5N)
        // The complexity of contains also needs to be considered
        for(int i = 0; i< input.length();i++){
            if(input.substring(i+1).contains(Character.toString(input.charAt(i)))){
                input = input.substring(0,i) + input.substring(i+1);
            }
        }
        return input;
    }

    public static String Level2(String input){
        //O(N)
        HashSet<Character> alreadyPresent = new HashSet<Character>();
        String output = "";
        for(int i = 0; i < input.length();i++){
            if(!alreadyPresent.contains(input.charAt(i))){
                output = output + input.charAt(i);
            }
            alreadyPresent.add(input.charAt(i));
        }

        return output;
    }
}
