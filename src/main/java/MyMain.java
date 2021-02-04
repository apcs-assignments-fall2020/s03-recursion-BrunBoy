public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        if (x<10){
            return x;
        }
        else{
            int krum=x%10;
            int murk=x/10;
            return krum+addDigits(murk);
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if (str.length()<=1){
            return true;
        }
        if (str.substring(0,1).equals(str.substring(str.length()-1))){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        else{
            return false;
        }
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        if(str.length()<=1){
            return str;
        }
        else{
            return reverse(str.substring(1))+str.substring(0, 1);
        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
