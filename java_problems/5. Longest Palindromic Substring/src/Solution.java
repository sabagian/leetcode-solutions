class Solution {
    public String longestPalindrome(String s) {
        String result=new String();
        for(int k=0; k<s.length(); k++){
            for(int i=k; i<s.length(); i++){
                if(isPalidrome(s.substring(k, i)) && s.substring(k, i).length()>=result.length()){
                    result=s.substring(k, i);
                }
            }
        }
        return result;
    }
    private boolean isPalidrome(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false; 
            }
        }
        return true;
    }
}