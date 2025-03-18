import java.util.ArrayList;
import java.util.List;

import javacore.Employee;
public class ArraylistTest {

	public class ArrayListTest {
		public static void main (String[] args) {
			List lst = new ArrayList();
			lst.add('1');
			lst.add('c');
			lst.add(true);
			lst.add(2.3);
			lst.add("java");
			System.out.println(lst);
			lst.add(new Employee());
			System. out.println(lst);
			System.out.println(lst.get(1));
			double number = (double) lst.get(3);
		}
	}
}
