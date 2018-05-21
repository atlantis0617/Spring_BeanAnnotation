package org.spring.annotation.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class TestBase {
	private ClassPathXmlApplicationContext context;
	private String xmlPath;

	/**
	 * 无参构造器
	 */
	public TestBase() {

	}

	/**
	 * 含参构造器，初始化配置文件路径
	 * 
	 * @param xmlPath
	 *            配置文件路径
	 */
	public TestBase(String xmlPath) {

		this.xmlPath = xmlPath;

	}

	/**
	 * 初始化spring的IOC容器
	 */
	@Before
	public void before() {

		if (StringUtils.isEmpty(xmlPath)) {// 配置文件默认路径
			xmlPath = "classpath:spring_*.xml";
		}
		// 加载配置文件到spring容器中
		context = new ClassPathXmlApplicationContext(xmlPath.split("[,\\s]+"));
		// 启动IOC容器s
		context.start();

	}

	/**
	 * 销毁容器
	 */
	@After
	public void after() {

		if (context != null) {
			context.destroy();
		}

	}

	/**
	 * 根据bean id获取bean对象
	 */
	public Object getBean(String id) {

		return context.getBean(id);

	}
}
