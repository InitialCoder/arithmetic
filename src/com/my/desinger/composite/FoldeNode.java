package com.my.desinger.composite;

import java.util.ArrayList;
import java.util.List;

class FoldeNode extends Node{
	
	private List<Node> files=new ArrayList<Node>();
	
	public FoldeNode(String fileName){
		super(fileName);
	}
	
	@Override
	public void display() {
		System.out.println(fileName);
		for (Node node : files) {
			node.display();
		}
		 
	}
	
	@Override
	public void addNode(Node node) {
		files.add(node);
	}
	
}