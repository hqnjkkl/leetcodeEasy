package leetcodeEasy;

public class TwoSum1 {

	public static void main(String[] args) {
		int res[] = new TwoSum1().twoSum(new int[] {2,7,11,15}, 9);
		for (int i= 0;  i< res.length; i++) {
			System.out.println(res[i]);
		}
	}

    public int[] twoSum(int[] nums, int target) {
    	int res[] = new int[2];
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]+nums[j]==target) {
        			res[0] = i;
        			res[1] = j;
        			return res;
        		}
        	}
        }
        return res;
    }
}
