package com.my.desinger.composite;

import java.io.File;
/**
 * 
 * 组合模式
 *
 * @ClassName: Test 
 * @Description: 组合模式
 * @author wu
 * @date 2019-01-14 08:58:83
 *
 */
class Test{
	
	public static void createNodes(Node node) throws Exception{
		
		File file=new File(node.fileName);
		File[] files=file.listFiles();
		for (File fi : files) {
			if(fi.isFile()){
				FileNode nd=new FileNode(fi.getAbsolutePath());
				node.addNode(nd);
			}
			if(fi.isDirectory()){
				FoldeNode nd=new FoldeNode(fi.getAbsolutePath());
				node.addNode(nd);
				createNodes(nd);//使用递归生成树结构
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Node node=new FoldeNode("C:\\AppData");
		try {
			createNodes(node);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		node.display();
		
	}
	
	
}