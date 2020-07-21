package com.gvn.lambda;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

class AverageOneTest {
   
	@Test
	public void test() {
		//fail("Not yet implemented");
		Assert.assertEquals(20,AverageOne.average(Arrays.asList(30,20,10)),0);
		Assert.assertEquals(40,AverageOne.average(Arrays.asList(40,50,30)),0);

	}

}
