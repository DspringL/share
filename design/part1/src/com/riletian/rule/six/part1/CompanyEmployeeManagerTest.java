package com.riletian.rule.six.part1;

import org.junit.jupiter.api.Test;

class CompanyEmployeeManagerTest {

	@Test
	void testPrintAllEmployee() {
		CompanyEmployeeManager cManager = new CompanyEmployeeManager();
		cManager.printAllEmployee(new PartEmployeeManager());
	}

}
