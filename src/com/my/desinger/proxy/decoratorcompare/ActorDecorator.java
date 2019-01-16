package com.my.desinger.proxy.decoratorcompare;

import com.my.desinger.proxy.IActor;

/**
 * z装饰者模式，用于比较代理模式
 *
 * @ClassName: DeoActorAgent 
 * @Description: TODO
 * @author wu
 *
 */
public class ActorDecorator implements IActor{

	private IActor actor;
	
	public ActorDecorator (IActor actor){
		this.actor=actor;
	}
	
	@Override
	public void show() {
		 System.out.println("化过妆后的演员演出,不会控制演员是否演出!");
		 actor.show();
	}
	
	
}
