package com.riletian.part1.two.plan4;

import org.junit.jupiter.api.Test;

class AbstractAuthorizeTest {

	@Test
	void test() {
		AbstractMemberAuthorize mAuthorizeService = new MemberAuthorize();
		mAuthorizeService.reg("mem001", "123456");
		mAuthorizeService.login("mem001", "123456");
		mAuthorizeService.logout(1L);
		mAuthorizeService.off(1L);
		
		AbstractAuthorize eAuthorizeService = new EmployeeAuthorize();
		eAuthorizeService.login("emp001", "123456");
		eAuthorizeService.logout(2L);
	}

}
