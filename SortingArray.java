package week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArray {

	public static void main(String[] args) {
		String arr[] = { "Aspire System", "HCL", "CTS", "WIPRO" };
		List<String> str = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("*****LENGTH OF THE ARRAY****");
		int strsize = str.size();
		System.out.println(strsize);
		System.out.println("********SORTED ARRAY*******");
		Collections.sort(str);
		System.out.println(str);
		for(int i=strsize-1;i>=0;i--) {
			System.out.println(str.get(i));
		}
	}

}
