package org.spring.annotation.test;

import org.junit.Test;
import org.spring.annotation.bean.BeanAnnotation;

public class TestBeanAnnotation extends TestBase {
	/**
	 * 构造器传入spring配置文件路径
	 */
	public TestBeanAnnotation() {

		super("classpath:spring_beanannotation.xml");

	}

	/**
	 * 测试注解方式获取bean对象
	 */
	@Test
	public void testBeanAnnotation() {

		BeanAnnotation bean = (BeanAnnotation) super.getBean("beanAnnotation");
		bean.say();

	}

	/**
	 * 测试注解方式的Bean的作用域
	 */
	@Test
	public void testBeanScope() {

		BeanAnnotation bean = (BeanAnnotation) super.getBean("beanAnnotation");
		bean.hasCode();

		BeanAnnotation bean2 = (BeanAnnotation) super.getBean("beanAnnotation");
		bean2.hasCode();

	}
}
