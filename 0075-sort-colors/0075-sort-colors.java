class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int one =0;
        int end =nums.length-1;

        while(one<=end){
            if(nums[one]==0){
                int temp =nums[start];
                nums[start]=nums[one];
                nums[one]=temp;
                start++;
                one++;
            }else if(nums[one]==1){
                one++;
            }else if(nums[one]==2){
                int temp =nums[one];
                nums[one]=nums[end];
                nums[end]=temp;
                end--;
            }
        }
        
    }
}