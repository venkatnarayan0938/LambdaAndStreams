package com.gvn.lambda;

import java.util.*;
import java.util.function.Function;

public class AverageOne {

	public static int average(List<Integer> arr) 
	{
		Function<List<Integer>,Integer> sum = s ->{int q=0; for(Integer i:s) q+=i; return q;};
		Function<List<Integer>, Integer> function = t -> {int z=sum.apply(arr); return z/t.size();};
		return function.apply(arr);
	}
}
