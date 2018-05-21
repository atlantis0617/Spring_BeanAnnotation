package org.spring.annotation.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class BeanAnnotation {
	public void say() {

		System.out.println("注解方式获取成功");

	}

	public void hasCode() {

		System.out.println("BeanAnnotation:" + this.hashCode());

	}
}
