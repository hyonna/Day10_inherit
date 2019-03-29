package com.himart;

public class Customer {

	private int price;
	private int point;

	public Customer() {

		this.price = 1000;
		this.point = 0;

	}

	// 구매메서드
	// buy
	// 매개변수 1개

	public void buy(Product p) {

		int priceNum = this.price - p.getPrice();
		int pointNum = this.point + p.getPoint();
		System.out.println(p.getBrand() + " 구매 후 남은금액 : " + priceNum + "만원");
		System.out.println(p.getBrand() + " 구매 후 남은 포인트 : " + pointNum + "점");

	}

//	public void buy(Product p) {
//
//		int priceNum = this.price - p.getPrice();
//		int pointNum = this.point + p.getPoint();
//		System.out.println(p.getBrand() + " 컴퓨터 구매 후 남은금액 : " + priceNum + "만원");
//		System.out.println(p.getBrand() + " Tv 구매 후 남은 포인트 : " + pointNum + "점");
//
//	}
//
//	public void buy(Product p) {
//
//		int priceNum = this.price - p.getPrice();
//		int pointNum = this.point + p.getPoint();
//		System.out.println(p.getName() + "구매 후 남은금액 : " + priceNum + "만원");
//		System.out.println(p.getBrand() + " Tv 구매 후 남은 포인트 : " + pointNum + "점");
//
//	}

}
