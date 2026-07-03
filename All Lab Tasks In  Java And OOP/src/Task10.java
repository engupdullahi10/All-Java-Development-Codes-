public class Task10 {
    //Q10. Function to check palindrome
    public static boolean isPalindrome(String str){
        if (str==null){
            return false;
        }
        str= str.toLowerCase();

        int left= 0;
        int right= str.length()-1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }
    public static void main(String[] args){
        String word="Madam";
        boolean result=isPalindrome(word);
        System.out.println("Is Palindrome: " + result);
    }
}
