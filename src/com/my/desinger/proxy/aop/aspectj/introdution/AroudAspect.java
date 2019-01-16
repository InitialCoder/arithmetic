package com.my.desinger.proxy.aop.aspectj.introdution;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.my.desinger.proxy.aop.introdution.Love;

/**
 * Aspectj 引入式争强使用方式
 * value属性指定了哪种类型的bean要引入该接口。defaultImpl属性指定了为引入功能提供实现的类，@DeclareParents注解所标注的属性指明要引入的接口。
 *
 * @ClassName: AroudAspect 
 * @Description: TODO
 * @author wu
 * @date 2019-01-16 14:21:83
 *
 */
@Component
@Aspect
public class AroudAspect {

	@DeclareParents(value="com.my.desinger.proxy.aop.programing.GreetingImpl",defaultImpl=LoveImpl.class)
	private Love love;
}
