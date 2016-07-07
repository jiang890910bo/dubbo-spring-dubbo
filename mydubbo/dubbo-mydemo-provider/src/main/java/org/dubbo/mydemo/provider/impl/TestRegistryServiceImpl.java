package org.dubbo.mydemo.provider.impl;

import org.dubbo.mydemo.api.TestRegistryService;
import org.springframework.stereotype.Service;

@Service
public class TestRegistryServiceImpl implements TestRegistryService{

	public String sayHello(String name) {
		return "hello "+name;
	}

}
