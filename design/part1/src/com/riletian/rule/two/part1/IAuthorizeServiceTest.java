package com.riletian.rule.two.part1;

import org.junit.jupiter.api.Test;

class IAuthorizeServiceTest {

	@Test
	void test() {
		IAuthorizeService mAuthorizeService = new MemberAuthorizeServiceImpl();
		mAuthorizeService.reg("mem001", "123456");
		mAuthorizeService.login("mem001", "123456");
		mAuthorizeService.logout(1L);
		mAuthorizeService.off(1L);
		
		IAuthorizeService eAuthorizeService = new EmployeeAuthorizeServiceImpl();
		eAuthorizeService.login("emp001", "123456");
		eAuthorizeService.logout(2L);
		eAuthorizeService.reg("emp001", "123456");
		eAuthorizeService.off(2L);
	}

}
