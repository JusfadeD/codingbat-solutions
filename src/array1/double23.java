package array1;

public class double23 {
    public boolean double23(int[] nums) {
        if(nums.length<2){
            return false;
        }
        else{
            return nums[0]==2&&nums[1]==2||nums[0]==3&&nums[1]==3;
        }
    }
}
