package Fifth;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("d");
		list2.add("e");
		list2.add("f");
		list2.add("g");
		list2.add("p");

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("h");
		list3.add("i");
		list3.add("u");

		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("k");
		list4.add("d");

		ArrayList<String> list5 = new ArrayList<String>();
		list4.add("l");
		list4.add("m");
		list5.add("d");

		/*
		 * list1.retainAll(list2); for(String i : list1) { for(String j: list2) {
		 * if(i==j) { System.out.println(j); } for(String k: list3) { if(j==k) {
		 * System.out.println(k); } for(String l: list4) { if(k==l) {
		 * System.out.println(l); } for(String m: list5) { if(l==m) {
		 * System.out.println(m); } } } } } }
		 */

		System.out.println(list1);

	}

}
