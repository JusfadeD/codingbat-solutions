package warmup2;

public class array667 {
    public int array667(int[] nums) {
        int count1=0;
        for (int i = 0; i<nums.length-1; i++){
            if(nums[i]==6&&nums[i+1]==6){
                count1+=1;
            }
            if(nums[i]==6&&nums[i+1]==7){
                count1+=1;
            }
        }
        return count1;
    }
}
