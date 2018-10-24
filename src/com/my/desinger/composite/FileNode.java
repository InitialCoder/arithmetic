package com.my.desinger.composite;

public class FileNode extends Node{

	public FileNode(String fileName) {
		super(fileName);
	}
	
	@Override
	public void display() {
		System.out.println(fileName);
	}
	 
}
