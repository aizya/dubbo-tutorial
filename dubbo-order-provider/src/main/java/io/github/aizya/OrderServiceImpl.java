package io.github.aizya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xiaoxiong
 * @Title: OrderServiceImpl
 * @Description: TODO
 * @date 18-7-21上午11:37
 * @see: 如何引入slf4j: https://blog.csdn.net/sinat_32366329/article/details/80140060
 * @see: 如何使用slf4j占位符: https://www.cnblogs.com/wahaha603/p/6888247.html
 */
public class OrderServiceImpl implements OrderService {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Override
	public DoOrderResponse doOrder(DoOrderRequest request) {
		LOGGER.warn("Catch request with name is {} ", request.getName());

		DoOrderResponse response = new DoOrderResponse();
		response.setCode(200);
		response.setMessage("Success response");
		return response;
	}
}
