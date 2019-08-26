package part1.six.plan2;

import org.junit.jupiter.api.Test;

class CompanyEmployeeManagerTest {

	@Test
	void testPrintAllEmployee() {
		CompanyEmployeeManager cManager = new CompanyEmployeeManager();
		cManager.printAllEmployee(new PartEmployeeManager());
	}

}
