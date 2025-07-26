package array1;

public class sum2 {
    public int sum2(int[] nums) {
        int sum=0;
        if (nums.length<2){
            for(int i=0; i<nums.length; i++){
                sum+=nums[i];
            }return sum;
        }
        else{
            for (int i=0; i<2; i++){
                sum+=nums[i];
            }return sum;
        }

    }
}
