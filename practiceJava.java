
import java.util.*;
public class practiceJava {
    public static int count_vowel_inlowercase(String str){
        String vowels = "aeoiu";
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<vowels.length();j++){
            if(str.charAt(i)==vowels.charAt(j)){
                count++;
            }
            }
        }
        return count;
    }
    public static void main(String args[]){
        String str ="Dipesh";
        System.out.println(count_vowel_inlowercase(""));
    }
}
