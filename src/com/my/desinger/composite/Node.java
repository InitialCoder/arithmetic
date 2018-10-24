package com.my.desinger.composite;
/**
 * 组合模式：对象包含对象，并且两种对象可以抽象为同一对象，合适有树形结构出现的地方
 * @author wu
 *
 */
public abstract class Node {
	
	protected String fileName;
	
	public Node(String fileName){
		this.fileName=fileName;
	}
	
	public void addNode(Node node) throws Exception{
		throw new Exception("Invalid Exception!");
	}
	
	public abstract void display();

	
}
