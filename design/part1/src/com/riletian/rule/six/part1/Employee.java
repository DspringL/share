package com.riletian.rule.six.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 总部员工类
 * @author lwz
 *
 */
@Data
@AllArgsConstructor
@ToString
public class Employee {
	private Long id;
	private String name;
}