package com.navjot.junit;

import java.util.Comparator;

public class AlphabeticalPriority implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2); // A to Z
	}

}
