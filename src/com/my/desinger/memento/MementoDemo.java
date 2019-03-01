package com.my.desinger.memento;

public class MementoDemo {

	public static void main(String[] args) {
		
		Origintor ori = new Origintor("wu", 17);
		MementStorage stor = new MementStorage();
		stor.add(ori.saveToMemento());
		System.out.println("-----"+ori);
		ori.setName("wupeiliang");
		stor.add(ori.saveToMemento());
		System.out.println("-----"+ori);
		ori.setName("wupeiliang12321");
		ori.setAge(50);
		stor.add(ori.saveToMemento());
		System.out.println("-----"+ori);
		System.out.println("==================");
		ori.rewaper(stor.get());
		System.out.println("-----"+ori);
		ori.rewaper(stor.get());
		System.out.println("-----"+ori);
		ori.rewaper(stor.get());
		System.out.println("-----"+ori);
		System.exit(0);
	}
}
