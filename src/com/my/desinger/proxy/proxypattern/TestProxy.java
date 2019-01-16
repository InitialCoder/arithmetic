package com.my.desinger.proxy.proxypattern;

import com.my.desinger.proxy.Actor;

public class TestProxy {

	public static void main(String[] args) {
		ActorAgent agent=new ActorAgent(new Actor("周杰伦"));
		agent.show();
	}
}
