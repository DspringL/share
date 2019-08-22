package com.riletian.rule.five.part1;

public class CarShop {

	public void sell(Car car) {
		if(car.type==1) {
			makeBus();
		}else if(car.type==2) {
			makeBike();
		}
	}

	private void makeBike() {
		System.out.println("生产了自行车");
		
	}

	private void makeBus() {
		System.out.println("生产了公共汽车");
	}
}
