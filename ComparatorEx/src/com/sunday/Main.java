package com.sunday;

import java.util.TreeSet;

public class Main{

	public static void main(String[] args) {
		StringBuffer stringBuffer1 = new StringBuffer("AAA");
		StringBuffer stringBuffer2 = new StringBuffer("BBB");
		StringBuffer stringBuffer3 = new StringBuffer("CCC");
		StringBuffer stringBuffer4 = new StringBuffer("DDD");
		StringBuffer stringBuffer5 = new StringBuffer("EEE");
		StringBuffer stringBuffer6 = new StringBuffer("FFF");
		
		var test = new Test();
		var set = new TreeSet<StringBuffer>(test);
		set.add(stringBuffer1);
		set.add(stringBuffer6);
		set.add(stringBuffer3);
		set.add(stringBuffer2);
		set.add(stringBuffer5);
		set.add(stringBuffer4);
		System.out.println(set);
	}

}
