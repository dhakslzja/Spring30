package madvirus.spring.chap14.domain;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAsyncGlobal {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"receiver-async-global.xml");
		context.registerShutdownHook();
		try {
			Thread.sleep(60 * 60 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		context.close();
	}
}