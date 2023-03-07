package com.vti.frontend;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo_treeSet {
	public static void main(String[] args) {
		SortedSet<String> nameStudentsTreeSet = new TreeSet<>();
		nameStudentsTreeSet.add("a");
		nameStudentsTreeSet.add("b");
		nameStudentsTreeSet.add("v");
		nameStudentsTreeSet.add("a");
		nameStudentsTreeSet.add("c");
		nameStudentsTreeSet.add("d");
		nameStudentsTreeSet.add("e");
		nameStudentsTreeSet.add("f");
		nameStudentsTreeSet.add("c");
		nameStudentsTreeSet.add("g");
		for (String name : nameStudentsTreeSet) {
			System.out.println(name);
		}

	}
}
