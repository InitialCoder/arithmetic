package com.my.desinger.proxy.proxypattern;

import java.util.Random;

import com.my.desinger.proxy.IActor;

public class ActorAgent implements IActor{

	IActor actor;
	
	public ActorAgent(IActor actor) {
		
		this.actor=actor;
	}
	
	@Override
	public void show() {
		Random rand = new Random();
        if (rand.nextBoolean()) {
            System.out.println("代理人安排演员演出...");
            actor.show();
        } else {
            System.out.println("代理人有事情，不安排演出了...");
        }
		
	}
	
}
