class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res =new int[nums.length];

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int R =0;
        int L =nums.length-1;
        for(int j=nums.length-1;j>=0;j--){
            if(nums[R]<nums[L]){
                res[j]=nums[L];
                L--;
            }else{
                res[j]=nums[R];
                R++;
            }
        }
        return res;
    }
}