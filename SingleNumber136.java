package leetcodeEasy;

public class SingleNumber136 {

	public static void main(String[] args) {
		int test[] = {4,3,4,5,5,6,8,8,6};
		System.out.println(new SingleNumber136().singleNumber(test));
	}
	/**
	 * write the second time, 3minutes;
	 * @param nums
	 * @return
	 */
	  public int singleNumber(int[] nums) {
	       for(int i=1;i<nums.length;i++)
	    	   nums[0] = nums[0]^nums[i];
	    	return nums[0];
	    }

}
