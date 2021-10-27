package com.riletian.part2.prototype.plan3;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cat implements Cloneable{
	private String name;
	private int age;
	private Cat friend;
	@Override
	public Cat clone() throws CloneNotSupportedException {
		return (Cat) super.clone();
	}
}
