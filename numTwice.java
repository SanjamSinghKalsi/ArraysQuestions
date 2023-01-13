class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        int check=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                i=i+1;
            }
            else{
                return nums[i];
            }
        }
    
            return nums[nums.length-1];

    }
}
