package com.my.desinger.mediator.mediators;

import com.my.desinger.mediator.Colleague;
import com.my.desinger.mediator.Mediator;

public class MediatorImpl implements Mediator{

	@Override
	public void col1wincol2(int number, Colleague col1, Colleague col2) {
		col1.countMonery(number);
		col2.countMonery(-number);
	}

	@Override
	public void col2Wincol1(int number, Colleague col1, Colleague col2) {
		col1.countMonery(-number);
		col2.countMonery(number);
	}

}
