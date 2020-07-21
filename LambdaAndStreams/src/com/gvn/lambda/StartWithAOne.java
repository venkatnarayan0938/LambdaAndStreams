package com.gvn.lambda;

import java.util.*;
import java.util.function.Predicate;

public class StartWithAOne {

	public static List<String> StartsaLen3(List<String> str){
		return StartWithAOne.collectingFunction(str,(String s) -> s.charAt(0)=='a', (String s) ->s.length()==3);
	}
	
	public static List<String> collectingFunction(List<String> s,Predicate<String> predi1, Predicate<String> predi2){
		List<String >finalStr = new ArrayList<>();
		s.stream().forEach(x -> {if(predi2.test(x))
			if(predi1.test(x))
			finalStr.add(x);});
		return finalStr;
	}
}
