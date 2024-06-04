package BasicDSA_Java;

//check if a string is palindrome or not
//an example of a palindrome word is hannah
public class Palindrome {
    public static void main(String[] args) {

        String str = "madam";
        int start =0;
        int end = str.length() - 1;

        boolean isPalindrome = true;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str+ " is not palindrome");
        }
    }
}
