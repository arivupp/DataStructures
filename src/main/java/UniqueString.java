public class UniqueString {

    public static void main(String[] args) {
        String data = "Helo wrd!";
        System.out.println(isUniqueChars(data));
    }

    public static boolean simple(String str){
        //O(N^2)
        for(int i = 0;i < str.length();i++){
            for(int j= i+1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println("Not a unique string");
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isUniqueChars(String str) {
        //O(N)
        // https://stackoverflow.com/questions/19484406/detecting-if-a-string-has-unique-characters-comparing-my-solution-to-cracking
        if (str.length() > 256) { // NOTE: Are you sure this isn't 26?
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            // ASCII value for a is 97
            // str.charAt(i) is a, then val is 0, for b its 1, for A, its (65 - 97) = -32, for B its -31
            int val = str.charAt(i) - 'a';
            // 1 << val creates a integer which sets 1 for only the nth bit. for 'a' its sets the right most bit
            // for b its sets the 2nd right most bit simalrly for z it sets 26th bit from right.
            // for A again its sets the right most bit ( 1 << -32 )
            if ((checker & (1 << val)) > 0) return false;
            // checker = checker | (1 << val);
            // checker has 32 bits. And each bit is used to store whether a particular character is present.
            checker |= (1 << val);
        }
        return true;
    }
}
