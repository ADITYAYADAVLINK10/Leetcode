class Solution {
    public boolean isPalindrome(String s) {
      String lowercase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      String reversed = "";
        for(int i=lowercase.length()-1;i>=0;i--){
reversed = reversed + lowercase.charAt(i);        }
        if(lowercase.equals(reversed)){
            return true;
        }else{
            return false;
        }
        
    }
}