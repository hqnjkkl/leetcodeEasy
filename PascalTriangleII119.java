package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;
//7minutes finised
public class PascalTriangleII119 {
	public static void main(String[] args) {
		PascalTriangleII119 test = new PascalTriangleII119();
		List<Integer> res = test.getRow(4);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}
	
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++) {
        	res.add(0);
        }
        for(int i=0;i<=rowIndex;i++) {
        	for(int j=i;j>=0;j--) {
        		if(j==0 || j==i)
        			res.set(j, 1);
        		else {
        			res.set(j, res.get(j-1)+res.get(j));
        		}
        	}
        }
        return res;
    }
}
