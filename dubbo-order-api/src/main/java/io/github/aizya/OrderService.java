package io.github.aizya;

/**
 * @author xiaoxiong
 * @Title: OrderService
 * @Description: TODO
 * @date 18-7-21上午11:24
 */
public interface OrderService {

	/*
	 *  模拟订单请求接口
	 */
	DoOrderResponse doOrder(DoOrderRequest request);
}
