package org.dubbo.mydemo.consumer;

import java.io.IOException;

import org.dubbo.mydemo.api.TestRegistryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		applicationContext.start();
		TestRegistryService registryService = (TestRegistryService) applicationContext.getBean("registryService");
		System.out.println(registryService.sayHello("jiangbo"));
		System.out.println("(消费者)按任意键退出：");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
