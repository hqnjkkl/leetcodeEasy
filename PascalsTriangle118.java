package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {

	public static void main(String[] args) {

	}
	
	  public List<List<Integer>> generate(int numRows) {
		  List<List<Integer>> res = new ArrayList<List<Integer>>();
		  if(numRows>0) {
			  res.add(new ArrayList<Integer>());
			  res.get(0).add(1);
		  }
		  for(int i=1;i<numRows;i++) {
			  List<Integer> list = new ArrayList<Integer>();
			  List<Integer> up = res.get(i-1);
			  
			  for(int j=0;j<i+1;j++) {
				  if(j==0) {
					  list.add(up.get(0));
				  }else if(j==i) {
					  list.add(up.get(i-1));
				  }else {
					  list.add(up.get(j-1)+up.get(j));
				  }
			  }
		  }
		  return res;
	    }

}
