package design.part2.prototype.plan2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat implements Cloneable{
	private String name;
	private int age;
	@Override
	public Cat clone() throws CloneNotSupportedException {
		return (Cat) super.clone();
	}
}
