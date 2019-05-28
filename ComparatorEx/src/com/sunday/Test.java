package com.sunday;

import java.util.Comparator;

public class Test implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		var stringBuffer1 = o1;
		var stringBuffer2 = o2;
		
		/*
		 * int length1 = stringBuffer1.length(); int length2 = stringBuffer2.length();
		 */
		/*
		 * int val = 0; if(length1 < length2) { val=-100; }else if(length1 > length2) {
		 * val = 100; }else { val = 0; }
		 */
		int val = stringBuffer1.compareTo(stringBuffer2);
		
		return -val;
	}

}
