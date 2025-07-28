package array1;

public class bigDiff {
    public int bigDiff(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(max<Math.max(nums[i],nums[i+1])){
                max=Math.max(nums[i],nums[i+1]);
            }
            if(min>Math.min(nums[i],nums[i+1])){
                min=Math.min(nums[i],nums[i+1]);
            }
        }
        return max-min;
    }
}
