/*public class Example_5 {
    public int CountVowels(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }
}*/
public class Example_5{
    public int CountVowels(String s){
        int counter=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'a': case 'e': case 'i': case 'o': case 'u' :
                    counter++;
            }
        }
        return counter;
    }
}