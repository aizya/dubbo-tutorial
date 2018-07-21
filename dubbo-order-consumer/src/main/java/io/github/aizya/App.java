package io.github.aizya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: App
 * @Description: 用于使用dubbo进行服务的治理
 * @Author xiaoxiong
 * @Date 18-7-21上午11:50
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");
		OrderService orderService = (OrderService) context.getBean("orderService");

		// 如何获取实现接口
		DoOrderRequest request = new DoOrderRequest();
		request.setName("aizya");
		orderService.doOrder(request);
	}
}
