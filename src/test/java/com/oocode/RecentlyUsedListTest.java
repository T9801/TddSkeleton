package com.oocode;

import org.junit.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class RecentlyUsedListTest {

	@Test
	public void listShouldBeEmptyWhenInitialised() {
		RecentlyUsedList list = new RecentlyUsedList<String>();
		Assert.assertTrue(list.isEmpty());
	}

	@Test
	public void OneShouldBeAbleToAddSomethingToTheList() {
		RecentlyUsedList list = new RecentlyUsedList<String>();
		list.add("First entry!");
		Assert.assertThat(list.retrieve(0), equalTo("First entry!"));
		Assert.assertFalse(list.isEmpty());
	}

	@Test
	public void OneShouldBeAbleToRetrieveTheLatestEntryFromTheList() {
		RecentlyUsedList list = new RecentlyUsedList<String>();
		list.add("First entry!");
		list.add("Second entry!");
		Assert.assertThat(list.retrieve(0), equalTo("Second entry!"));
	}

	@Test
	public void ListItemsAreUnique() {
		RecentlyUsedList list = new RecentlyUsedList<String>();
		list.add("BBB");
		list.add("AAA");
		list.add("AAA");
		Assert.assertThat(list.retrieve(0), equalTo("AAA"));
		Assert.assertThat(list.retrieve(1), equalTo("BBB"));
	}

	@Test
	public void OneShouldNotBeAbleToRetrieveMoreElementsThanTheMaximum() {
		RecentlyUsedList list = new RecentlyUsedList<String>();
		list.add("AAA");

		boolean caught = false;
		try{
			list.retrieve(1);
		} catch (java.lang.IndexOutOfBoundsException e){
			caught = true;
			Assert.assertNotNull(e);
		}
		Assert.assertTrue(caught);
	}

	@Test
	public void OneShouldOnlyBeAbleToAdd3ElementsToTheList(){
		RecentlyUsedList list = new RecentlyUsedList<String>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		try{
			list.add("DDD");
		}
		catch (java.lang.ArrayIndexOutOfBoundsException e){

		}
		Assert.assertThat(list.length(), equalTo(3));
	}
}
