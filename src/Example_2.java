/*public class Example_2 {
    public boolean isPalindrome(String s) {

        int startIndex = 0;
        int endIndex = s.length() - 1;
        boolean isPalindrome = true;

        while (startIndex < endIndex) {
            char leftChar = s.charAt(startIndex);
            char rightChar = s.charAt(endIndex);
            if (leftChar != rightChar) {
                isPalindrome = false;
                break;
            }
            startIndex++;
            endIndex--;
        }

        return isPalindrome;
    }
}*/
public class Example_2{
    public boolean isPalindrome(String s){              //First of all,we don't need to assign variables such as start and endIndex or isPalindrome
        int i=0;
        while(i<s.length()-1){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){  //And we don't need to use leftchar and right char as variables either,we can check those with charAt() method
                return false;                           //we directly return false when we find an unequation
            }
            i++;
        }
        return true;                                    //Otherwise return true;
    }
}
