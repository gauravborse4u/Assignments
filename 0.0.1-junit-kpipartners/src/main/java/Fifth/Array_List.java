package Fifth;

import java.util.ArrayList;

public class Array_List {

	int Common() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("v");
		list2.add("e");
		list2.add("f");
		list2.add("g");
		list2.add("d");

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("d");
		list3.add("u");

		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("d");
		list4.add("o");

		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("d");
		list5.add("m");
		list5.add("k");

		list1.retainAll(list2);
		list1.retainAll(list3);
		list1.retainAll(list4);
		list1.retainAll(list5);

		String a = list1.get(0);
		int pos = list2.indexOf(a);
		System.out.println("Position of duplicate element is:" + pos);

		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array_List a11 = new Array_List();

		a11.Common();

	}
}
