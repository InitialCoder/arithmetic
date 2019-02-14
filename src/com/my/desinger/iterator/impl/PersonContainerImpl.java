package com.my.desinger.iterator.impl;

import com.my.desinger.iterator.Container;
import com.my.desinger.iterator.Iterator;
import com.my.desinger.iterator.Person;

public class PersonContainerImpl implements Container{

	private Person persons[]={new Person("a", "b"),new Person("c", "c"),new Person("b", "b"),new Person("aa", "bb")};
	
	@Override
	public Iterator getIterator() {
		 
		return new PersonIterator();
	}

	private class PersonIterator implements Iterator{

		int index = 0;
		@Override
		public boolean hasnext() {
			
			return index<persons.length;
		}

		@Override
		public Object next() {
			if(hasnext()){
				return persons[index++];
			}
			return null;
		}
		
	}
}
