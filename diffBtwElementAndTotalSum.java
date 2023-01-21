class Solution {
    public int differenceOfSum(int[] nums) {

    int totalSum = 0;
    for(int i =0;i<nums.length;i++){
        totalSum+= nums[i];
    }

    int digitSum = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>=10){
            int temp = nums[i];
            while(temp>0){
                int last = temp%10;
                temp = temp/10;
                digitSum = digitSum + last;
            }
        }
        else{
            digitSum = digitSum + nums[i];
        }
    }
    return totalSum - digitSum;
        
    }
}
