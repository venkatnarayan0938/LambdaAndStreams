package com.gvn.lambda;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

class StartWithAOneTest {

	@Test
	public void test() 
	{
		Assert.assertArrayEquals(new String[]{"abc","afg"}, StartWithAOne.StartsaLen3(Arrays.asList("abc","afg","gvn")).toArray());
		Assert.assertArrayEquals(new String[] {"abc", "acs"}, StartWithAOne.StartsaLen3(Arrays.asList("abc","bcfd","abcd","acs","gvn")).toArray());
	}

}
