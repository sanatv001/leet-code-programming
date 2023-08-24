package Strings;

public class lengthOfLastWord {

    public static void main(String args[]){
        String s="Hello World";
        System.out.println( lengthOflastword(s));
    }
    private static int lengthOflastword(String s) {
        int k=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                k++;
            }
            else{
                if(k>0)return k;
            }
        }
        return k;
    }
}
