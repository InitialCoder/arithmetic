package com.my.desinger.facade;

/**
 * 门面者模式
 * 
 * ABC 都分别实现不同的业务方法
 * 通过facade 类封装ABC 的具体方式引用可以减少客户端代码对其他对象的引用，减少代码复杂度、提高灵活性、代码安全性
 *  
 *  缺点：不符合开闭原则，修改代码只能直接修改源码，继承或重写不方便
 *
 * @ClassName: FacadeDemo 
 * @Description: TODO
 * @author wu
 * @date 2019-02-14 09:57:25
 *
 */
public class FacadeDemo {

	public static void main(String[] args) {
		Facade facade = new Facade();
		
		facade.doAjob();
	}
}
