package com.gvn.lambda;


import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;


class PlainCheckOneTest {

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{"aba","aca"}, PlainCheckOne.palindrome(Arrays.asList("aba","aca","abab")).toArray());
		Assert.assertArrayEquals(new String[]{"abcdcba","venkatnarayan"}, PlainCheckOne.palindrome(Arrays.asList("abcdcba","afga","venkatnarayan")).toArray());
	}


}
