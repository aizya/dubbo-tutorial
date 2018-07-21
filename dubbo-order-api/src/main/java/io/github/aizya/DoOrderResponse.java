package io.github.aizya;

import java.io.Serializable;

/**
 * @author xiaoxiong
 * @Title: DoOrderResponse
 * @Description: TODO
 * @date 18-7-21上午11:24
 * @see: https://blog.csdn.net/xyc_csdn/article/details/72865536
 */
public class DoOrderResponse implements Serializable {

	private static final long serialVersionUID = -5248969849731429314L;

	private Integer code;
	private String message;

	public DoOrderResponse() {
	}

	public DoOrderResponse(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "DoOrderResponse{" +
				"code=" + code +
				", message='" + message + '\'' +
				'}';
	}
}
