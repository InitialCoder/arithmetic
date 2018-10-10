package com.my.desinger.composite;

public class FileNode extends Node{

	private String name;
	
	public FileNode(String name) {
		this.name=name;
	}
	
	@Override
	public void display() {
		
		System.out.println(name);
	}

}
