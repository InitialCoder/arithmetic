package com.my.desinger.memento;
/**
 * 备忘录模式：原始类
 *
 * @ClassName: Origintor 
 * @Description: TODO
 * @author wu
 * @date 2019-02-19 17:42:18
 *
 */
public class Origintor {

	private String name;
	
	private int age;
	
	public Origintor(String name,int age ){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Memento saveToMemento(){
		return new Memento(this.name, this.age);
	}
	
	public void rewaper(Memento mto){
		this.name=mto.getName();
		this.age=mto.getAge();
	}

	@Override
	public String toString() {
		return "Origintor [name=" + name + ", age=" + age + "]";
	}
	
	
}
