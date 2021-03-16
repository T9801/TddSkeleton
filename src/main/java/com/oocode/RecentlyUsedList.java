package com.oocode;

public class RecentlyUsedList {
	private String _list;

	public RecentlyUsedList(){

	}

	public boolean isEmpty(){
		return true;
	}

	public void add(String arg){
		_list = arg;
	}

	public String retrieve(){
		return _list;
	}
}