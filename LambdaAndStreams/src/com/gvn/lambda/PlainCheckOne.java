package com.gvn.lambda;

import java.util.*;
import java.util.function.Predicate;

public class PlainCheckOne {

   public static List<String> palindrome(List<String> str){
		Predicate<String> predi = PlainCheckOne::checking;
		List<String> finalStr=new ArrayList<String>();
		for(String i:str) {
			if(predi.test(i))
				finalStr.add(i);
		}
		return finalStr;	
	}	
	public static boolean checking(String s1) 
	{
		int len=s1.length();
		for(int k=0;k<len/2;k++)
			if(s1.charAt(k)!=s1.charAt(len-k-1))
				return false;
		return true;
	}
}
