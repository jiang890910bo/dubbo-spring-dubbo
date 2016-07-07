package org.dubbo.mydemo.provider;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRegistry {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		/*String[] beans= applicationContext.getBeanDefinitionNames();
		for (String string : beans) {
			System.out.println(string);
		}*/
		applicationContext.start();
		System.out.println("按任意键退出：");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
