package leetcodeEasy;
//10minutes finished
public class RemoveElement27 {

	public static void main(String[] args) {
		int nums[] = {3,2,2,3};
		int res = new RemoveElement27().removeElement(nums,2);
		System.out.println(res);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	 public int removeElement(int[] nums, int val) {
		 int res = nums.length;
		 int vals = 0;
		 for(int i=res-1;i>=0;i--) {
			 if(nums[i]==val) {
				 vals++;
				 int tmp = nums[i];
				 nums[i] = nums[nums.length-vals];
				 nums[nums.length-vals] = tmp;
			 }
		 }
		 return res - vals;
	 }
}
