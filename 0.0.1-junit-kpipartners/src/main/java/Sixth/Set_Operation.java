package Sixth;

import java.util.HashSet;
import java.util.Set;

public class Set_Operation {

	public int set_size() {
		Set<Integer> Num = new HashSet<Integer>();

		Num.add(101);
		Num.add(102);
		Num.add(103);
		Num.add(104);
		Num.add(105);
		Num.add(108);
		Num.add(106);
		Num.add(107);
		Num.add(107);
		Num.add(108);
		Num.add(108);
		Num.add(109);
		Num.add(109);
		Num.add(110);
		Num.add(108);
		Num.add(108);
		Num.add(109);
		Num.add(109);
		Num.add(110);
		Num.add(101);

		int last=0;
		
		for(int x : Num) {
			last=x;
		}

		System.out.println("Last Element of Set is : " +last);
		

		return last;
}
	

	public static void main(String args[]) {
		Set_Operation s = new Set_Operation();
		s.set_size();

	}
}
