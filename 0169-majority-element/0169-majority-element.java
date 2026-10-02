class Solution {
    public int majorityElement(int[] nums) {
        int n= nums[0],votes=1;
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                n=nums[i];
            }else if(n==nums[i]){
                votes++;
            }else{
                votes--;
            }
        }
        return n;
    }
}