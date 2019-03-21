package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {

	public static void main(String[] args) {
		System.out.println(new RomanToInteger13().romanToInt("III"));
		System.out.println(new RomanToInteger13().romanToInt("IV"));
		System.out.println(new RomanToInteger13().romanToInt("IX"));
		System.out.println(new RomanToInteger13().romanToInt("LVIII"));
		System.out.println(new RomanToInteger13().romanToInt("MCMXCIV"));
	}
	/**
	 * accepted
	 * @param s
	 * @return
	 */
	 public int romanToInt(String s) {
		 int res = 0;
		 Map<Character,Integer> alp = new HashMap<Character, Integer>(){{
			 put('I',1);
			 put('V',5);
			 put('X',10);
			 put('L',50);
			 put('C',100);
			 put('D',500);
			 put('M',1000);
		 }};
		 int len = s.length();
		 for(int i=0;i<len;i++) {
			 if(i<len-1 && alp.get(s.charAt(i))<alp.get(s.charAt(i+1))) {
				 res += alp.get(s.charAt(i+1));
				 res -= alp.get(s.charAt(i));
				 i++;
			 }else {
				 res += alp.get(s.charAt(i));
			 }
		 }
		 return res;
	  }

}
