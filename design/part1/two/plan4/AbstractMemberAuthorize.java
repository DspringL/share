package part1.two.plan4;

/**
 * 会员鉴权抽象类
 * @author lwz
 *
 */
public abstract class AbstractMemberAuthorize extends AbstractAuthorize{
	//注册
	public abstract Long reg(String username,String password);
	//注销
	public abstract boolean off(Long uId);
}
