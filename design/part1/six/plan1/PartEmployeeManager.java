package part1.six.plan1;

import java.util.ArrayList;
import java.util.List;

/**
 * 分部员工管理
 * @author lwz
 *
 */
public class PartEmployeeManager {
	public List<PartEmployee> getAllEmployee(){
		List<PartEmployee> list = new ArrayList<>();
		list.add(new PartEmployee(1L, "张1"));
		list.add(new PartEmployee(2L, "王2"));
		list.add(new PartEmployee(3L, "邹3"));
		return list;
	}
}
