import java.util.ArrayList;

/**
 * Created by apandian on 6/6/2017.
 */
public class ReverseString {
    public static void main(String[] args) {
        //O(N)
        String data = "Helo wrd!";
        int length = data.length();
        char[] newValue = new char[length];
        for(int i=length - 1;i>=0;i--){
            newValue[length -1 - i] = data.charAt(i);
        }
        System.out.println(new String(newValue));
    }
}
