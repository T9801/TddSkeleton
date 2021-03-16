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
		Assert.assertThat(list.retrieve(0), equalTo("First entry!"));
		Assert.assertFalse(list.isEmpty());
	}

	@Test
	public void OneShouldBeAbleToRetrieveTheLatestEntryFromTheList() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.add("First entry!");
		list.add("Second entry!");
		Assert.assertThat(list.retrieve(0), equalTo("Second entry!"));
	}

	@Test
	public void ListItemsAreUnique() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.add("BBB");
		list.add("AAA");
		list.add("AAA");
		Assert.assertThat(list.retrieve(0), equalTo("AAA"));
		Assert.assertThat(list.retrieve(1), equalTo("BBB"));
	}

}
