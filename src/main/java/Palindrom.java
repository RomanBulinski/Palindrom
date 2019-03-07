public class Palindrom {

    public boolean isStringPalindrome(String str){

        if(str==null){
            return true;
        }
        char[] letters = str.toCharArray();
        int start = 0;
        int end = letters.length - 1;

        while(start<end){
            if(letters[start]!=letters[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
