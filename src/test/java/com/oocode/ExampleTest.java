package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class ExampleTest {

	@Test
	public void listShouldBeEmptyWhenInitialised() {
		RecentlyUsedList list = new RecentlyUsedList();
		Assert.assertTrue(list.isEmpty());
	}
}
