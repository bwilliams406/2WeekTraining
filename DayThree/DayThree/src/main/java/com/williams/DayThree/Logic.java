package com.williams.DayThree;

import java.util.*;

public class Logic {

	public static int findIndex(String arr[], String t) {

		if (arr != null) {

			int len = arr.length;
			int i = 0;

			while (i < len) {

				if (arr[i].startsWith(t)|| arr[i].endsWith(t)) {
					return i;
				} else {
					i = i + 1;
				}
			}
		}
		throw new RuntimeException("Search Value Is Not Present In The Array");
	}

}
