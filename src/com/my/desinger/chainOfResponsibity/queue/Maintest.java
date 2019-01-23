package com.my.desinger.chainOfResponsibity.queue;

import com.my.desinger.chainOfResponsibity.Tesk;
import com.my.desinger.chainOfResponsibity.TeskTypeEnum;

public class Maintest {

	public static void main(String[] args) {
		Client cli = new Client();
		Tesk tesk= new Tesk("for info test",TeskTypeEnum.INFO.typeName);
		cli.excute(tesk);

	}
}
