package com.oocode;


public class RecentlyUsedList {
	private String[] _list;
	private Integer _numberOfElements;

	public RecentlyUsedList(){
		_list = new String[3];
		_numberOfElements = 0;
	}

	public int length(){
		return _numberOfElements;
	}

	public boolean isEmpty(){
		if (_numberOfElements == 0)
			return true;
		return false;
	}

	public void add(String arg){
		for(int i=0; i < _list.length; i++){
			if (_list[i] == arg){
				return;
			}
		}
		_list[_numberOfElements] = arg;
		_numberOfElements++;
	}

	// nth_latest == 0 -> last one
	public String retrieve(int nth_latest){
		return _list[_numberOfElements-nth_latest-1];
	}
}