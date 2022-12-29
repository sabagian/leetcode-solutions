class Solution {

        public static int strStr(String haystack, String needle) {
            int result=-1;
            int first_index=0;
            if(haystack.length()>=needle.length()){
                while(first_index+needle.length()-1<=haystack.length()-1){
                    String s1=haystack.substring(first_index, first_index+needle.length()); 
                    if(s1.equals(needle)){
                        return first_index;
                    }
                    first_index+=1;
                }
            }
            return result;
        }
    };