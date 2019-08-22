package com.riletian.rule.six.part2;

import org.junit.jupiter.api.Test;

class CompanyEmployeeManagerTest {

	@Test
	void testPrintAllEmployee() {
		CompanyEmployeeManager cManager = new CompanyEmployeeManager();
		cManager.printAllEmployee(new PartEmployeeManager());
	}

}
