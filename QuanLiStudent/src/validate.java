import java.util.List;
import java.util.Scanner;

public class validate implements vali{

	@Override
	public void add(List<Student> list) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input name: ");
		String name = sc.nextLine();
		System.out.print("input age: ");
		int age = sc.nextInt();
		System.out.print("input mark: ");
		double mark = sc.nextDouble();
		
		Student st = new Student(name, age, mark);
		
		list.add(st);
		
	}

	@Override
	public void display(List<Student> list) {
		for (Student o: list) {
			System.out.println(o);
		}
		
	}

	@Override
	public void remove(List<Student> list, int i) {
		// TODO Auto-generated method stub
		for (int j=0; j<list.size(); j++) {
			if(j==i) {
				list.remove(j);
				break;
			}
		}
	}

	@Override
	public void edit(List<Student> list, int i) {
		// TODO Auto-generated method stub
		for ( int j=0; j<list.size(); j++) {
			if(j==i) {
				Scanner sc = new Scanner(System.in);
				System.out.print("input name: ");
				String name = sc.nextLine();
				System.out.print("input age: ");
				int age = sc.nextInt();
				System.out.print("input mark: ");
				double mark = sc.nextDouble();
				
				
				
				list.get(j).setName(name);
				list.get(j).setAge(age);
				list.get(j).setMark(mark);
				break;
			}
		}
	}

}
