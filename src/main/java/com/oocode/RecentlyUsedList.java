package com.oocode;

public class RecentlyUsedList {
	private String[] _list;
	private Integer _elms;

	public RecentlyUsedList(){
		_list = new String[2];
		_elms = 0;
	}

	public boolean isEmpty(){
		return true;
	}

	public void add(String arg){
		_list[_elms] = arg;
		_elms++;
	}

	// nth_latest == 0 -> last one
	public String retrieve(int nth_latest){
		return _list[_elms-1];
	}
}