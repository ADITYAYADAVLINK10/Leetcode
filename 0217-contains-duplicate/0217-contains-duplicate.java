import java.util.Hashtable;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer,Integer> n=new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(n.containsKey(nums[i])){
                return true;
            }else{
                n.put(nums[i],nums[i]);
            }
        }
        return false;
    }
}