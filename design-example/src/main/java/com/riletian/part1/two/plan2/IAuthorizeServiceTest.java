package com.riletian.part1.two.plan2;

import org.junit.jupiter.api.Test;

class IAuthorizeServiceTest {

	@Test
	void test() {
		MemberAuthorizeServiceImpl mAuthorizeService = new MemberAuthorizeServiceImpl();
		mAuthorizeService.reg("mem001", "123456");
		mAuthorizeService.login("mem001", "123456");
		mAuthorizeService.logout(1L);
		mAuthorizeService.off(1L);
		
		IAuthorizeService eAuthorizeService = new EmployeeAuthorizeServiceImpl();
		eAuthorizeService.login("emp001", "123456");
		eAuthorizeService.logout(2L);
	}

}
