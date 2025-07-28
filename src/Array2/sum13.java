package array1;

public class sum13 {
    public int sum13(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(nums.length==0){
                return 0;
            }
            if(nums[i]==13){
                i++;
                continue;
            }
            else{
                sum=sum+nums[i];
            }
        }
        return sum;
    }
}
