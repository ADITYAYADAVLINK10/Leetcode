import java.util.Hashtable;
class Solution {
   public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> n=new HashSet<>();
        for(int vol:nums){
            if(!n.contains(vol)){
                n.add(vol);
            }else{
                return true;
            }
        }
        return false;
    }
}
