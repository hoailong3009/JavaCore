package Chapter4;

import java.util.ArrayList;

public class Run {

	public static void main(String[] args) {
		Student st1 = new Student("Nguyen Van A", "1");
		Student st2 = new Student("Nguyen Van B", "2");
		Student st3 = new Student("Tran Van C", "3");
		Student st4 = new Student("Pham Van D", "4");
		Student st5 = new Student("Dinh Van E", "4");

		ArrayList<Student> arr = new ArrayList();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyen")) {
				System.out.println("Thông tin: " + arr.get(i));
			}
		}
	}
}
