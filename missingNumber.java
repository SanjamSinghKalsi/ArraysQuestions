class Solution {
    public int missingNumber(int[] nums) {

    Arrays.sort(nums);
    for(int i=1;i<nums.length;i++){
        if(nums[i]-nums[i-1]>1){
            return nums[i-1]+1;
        }
    }
    if(nums.length==1){
            if(nums[0]==0){
            return 1;
           }
           return nums[0]-1;
    }
    if(nums[0]!=0){
        return 0;
    }
    else{
    return nums.length;
    }

    }
}
