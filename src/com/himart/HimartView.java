package com.himart;

public class HimartView {

	// 각 제품의 정보를 출력하는 메서드

	public void view(Product p) {

		System.out.println("TV INFO");
		System.out.println();
		System.out.println("BRAND : " + p.getBrand());
		System.out.println("COLOR : " + p.getColor());
		System.out.println("PRICE : " + p.getPrice());
		System.out.println("POINT : " + p.getPoint());
		System.out.println("============================");
		
		if(p instanceof Tv) {
			
			Tv t = (Tv)p;
			System.out.println("INCH : " + t.getInch());
			
		} else if(p instanceof Computer) {
			
			Computer c = (Computer)p;
			System.out.println("SIZE : " + c.getSize());
			
			
		} else {
			
			
			Handphone h = (Handphone)p;
			System.out.println("NAME : " + h.getName());
			
		}

	}

	

}
