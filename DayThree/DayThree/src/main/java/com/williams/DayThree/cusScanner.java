package com.williams.DayThree;

import java.io.InputStream;
import java.util.*;

public class cusScanner extends Logic {

	public cusScanner(InputStream in) {

		Scanner scanner = new Scanner(System.in);

		String[] my_array = { "twbxkqvphd", "gcrmwpkoks", "zxayutxkrx", "tklnxytiar", "lqkysnihrk", "loxlrguzwz",
				"cgisscunvr", "dzbnncjjhg", "xutcrfgaqx", "vwhmtivldx" };

		System.out.println("What would you like to search for? Type Below");
		String searchValue = scanner.nextLine();

		System.out.println("Index position of " + searchValue + " is: " + findIndex(my_array, searchValue));

	}


}
