package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class TreeSetComparator implements Comparator<String> {

	public int compare(String s1, String s2) {
		if (Double.valueOf(s1) - Double.valueOf(s2) == 0) {
			return 0;
		} else {
			return (Double.valueOf(s1) - Double.valueOf(s2) > 0) ? 1 : -1;
		}
	}

}
