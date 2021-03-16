package com.oocode;


import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList<T> {
	private List<T> _list;

	public RecentlyUsedList(){
		_list = new ArrayList<>(3);
	}

	public int length(){
		return _list.size();
	}

	public boolean isEmpty(){
		return _list.isEmpty();
	}

	public void add(T arg){
		if (_list.size() == 3) {
			throw new java.lang.ArrayIndexOutOfBoundsException();
		}
		for(int i=0; i < _list.size(); i++){
			if (_list.get(i) == arg){
				return;
			}
		}
		_list.add(arg);
	}

	// nth_latest == 0 -> last one
	public T retrieve(int nth_latest){
		return _list.get(_list.size()-nth_latest-1);
	}
}