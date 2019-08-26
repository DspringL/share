package part1.two.plan3;

public class EmployeeAuthorizeServiceImpl implements IAuthorizeService {

	@Override
	public Long login(String username, String password) {
		System.out.println(username+"：员工，登录成功");
		return 1L;
	}

	@Override
	public boolean logout(Long uId) {
		System.out.println(uId+"：员工，登出成功");
		return true;
	}

}
