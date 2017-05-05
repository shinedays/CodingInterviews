package ReplaceBlank_04;

/**
 * Created by bupt on 5/2/17.
 */
public class Solution {
    public static char[] replaceBlank(char[] words,int maxLength){
        int length = words.length;
        if(words == null )
            return null;

        int originLength = 0;
        int blankNum = 0;
        int i = 0;
        while(words[i] != '\0'){
            if(words[i] == ' ')
                blankNum ++;
            originLength ++;
            i++;
        }

        int newLength = originLength + blankNum *2;
        if(maxLength < newLength)
            return null;
        int indexOrigin = originLength - 1;
        int indexNew = newLength -1;
        while(indexOrigin >=0 && indexNew > indexOrigin){
            if(words[indexOrigin] == ' '){
                words[indexNew --] = '0';
                words[indexNew --] = '2';
                words[indexNew --] = '%';
            } else {
                words[indexNew --] = words[indexOrigin];
            }
            indexOrigin --;
        }
        return words;

    }

    public static void main(String[] args) {
        int length = 25;
        char[] words = new char[length];
        String modifyWords = "Hello World";
        if(length < modifyWords.length() + 1)
            return;
        int i;
        for(i = 0;i < modifyWords.length();i++){
            words[i] = modifyWords.charAt(i);
        }
        //point! in java ,char pass-by-value not reference
        System.out.println(replaceBlank(words,length));
    }
}
