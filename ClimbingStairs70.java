package leetcodeEasy;
//5 minutes
public class ClimbingStairs70 {

	public static void main(String[] args) {
		int res = new ClimbingStairs70().climbStairs(3);
		System.out.println(res);
	}
    public int climbStairs(int n) {
    	if(n<3)
    		return n;
        int one = 1,two=2,res=3;
        for(int i=2;i<n;i++) {
        	res = one + two;
        	one = two;
        	two = res;
        }
        return res;
    }
}
