package com.my.desinger.command;

/**
 * 命令模式：将一个或多个可执行的命令封装成一个对象，然后交给一个可以接受此对象的处理类处理，此类再负责将该命令集合对象分发给可以处理命令的对象具体执行命令
 * 优点： 1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。

缺点：使用命令模式可能会导致某些系统有过多的具体命令类。

使用场景：认为是命令的地方都可以使用命令模式，比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。

注意事项：系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
 *
 * @ClassName: TestCommand 
 * @Description: TODO
 * @author wu
 * @date 2019-01-24 16:28:11
 *
 */
public class TestCommand {

	public static void main(String[] args) {
		
		LaoDongWeiYuan ldwy=new LaoDongWeiYuan();
		//指派执行某命令的执行者  
		//如：指派一个擦窗的人进行大扫除，这个人就负责擦窗
		ldwy.addExecuters("saodi");
		ldwy.addExecuters("cachuang");
		
		ldwy.executeOrders();
	}
}
