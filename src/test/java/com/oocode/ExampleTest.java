package com.oocode;

import org.junit.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class ExampleTest {

	@Test
	public void listShouldBeEmptyWhenInitialised() {
		RecentlyUsedList list = new RecentlyUsedList();
		Assert.assertTrue(list.isEmpty());
	}

	@Test
	public void OneShouldBeAbleToAddSomethingToTheList() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.add("First entry!");
		Assert.assertThat(list.retrieve(), equalTo("First entry!"));
		Assert.assertFalse(list.isEmpty());
	}

	@Test
	public void OneShouldBeAbleToRetrieveTheLatestEntryFromTheList() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.add("First entry!");
		list.add("Second entry!");
		Assert.assertThat(list.retrieve(), equalTo("Second entry!"));
	}

}
