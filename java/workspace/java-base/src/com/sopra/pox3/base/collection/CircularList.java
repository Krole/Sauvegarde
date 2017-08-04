package com.sopra.pox3.base.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CircularList <E> extends ArrayList<E> implements Iterator<E>{
	int count;
	
	public E next() {

		System.out.println(count);
	
		if (count == this.size()) {
			count = 0;
		} 
		E result = this.get(count);
		count ++;
		return result;
	}
	

	@Override
	public Iterator<E> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		return true;
	}
	

	

}
