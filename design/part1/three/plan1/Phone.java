package design.part1.three.plan1;

/**
 * 手机类
 * 
 * @author lwz
 *
 */
public class Phone {
	
	public void receive(Sms sms) {
		String message = sms.getInfo();
		System.out.println(message);
	}
    /**
    public void receive(Email email) {
        String message = sms.getInfo();
        System.out.println(message);
    }
    */
}
