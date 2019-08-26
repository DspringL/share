package part1.two.plan2;

/**
 * 会员鉴权接口
 * @author lwz
 *
 */
public interface IMemberAuthorizeService {
	//注册
	public Long reg(String username,String password);
	//注销
	public boolean off(Long uId);
}
