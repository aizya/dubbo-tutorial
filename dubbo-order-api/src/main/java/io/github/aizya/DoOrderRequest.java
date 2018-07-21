package io.github.aizya;

import java.io.Serializable;

/**
 * @author xiaoxiong
 * @Title: DoOrderRequest
 * @Description: TODO
 * @date 18-7-21上午11:25
 */
public class DoOrderRequest implements Serializable {

	private static final long serialVersionUID = 2958929522890842032L;

	private String name;

	public DoOrderRequest() {
	}

	public DoOrderRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DoOrderRequest{" +
				"name='" + name + '\'' +
				'}';
	}
}
