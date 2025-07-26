package array1;

public class maxTriple {
    public int maxTriple(int[] nums) {
        int first = nums[0];
        int mid = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        int max = first;
        if (mid > max) {
            max = mid;
        }
        if (last > max) {
            max = last;
        }
        return max;
    }
}
