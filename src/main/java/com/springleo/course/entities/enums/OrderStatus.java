package com.springleo.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	//converter de numero para o OrderStatus correspondente ex 1, 2 ou 3 etc
	public static OrderStatus valueOf(int code) {
		//se esse codigo que vc escreveu for igual a algum codigo do orderstatus ele retorna
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			
		}
	}
	throw new IllegalArgumentException("Invalid OrderStatus code");
}
}
