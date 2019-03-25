package leetcodeEasy;
//15minutes
public class MaximumSubarray53 {
	
	public static void main(String[] args) {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int res = new MaximumSubarray53().maxSubArray(nums);
		System.out.println(res);
	}
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int m1 = nums[0];
        for(int i=1;i<nums.length;i++) {
        	//以i为底的最大的
        	if(m1+nums[i]>nums[i]) {
        		m1 = m1+nums[i];
        	}else {
        		m1 = nums[i];
        	}
        	max = max>m1?max:m1;
        	
        }
        return max;
    }
}
