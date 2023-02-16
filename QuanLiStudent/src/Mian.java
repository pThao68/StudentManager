import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		
			
			validate val = new validate();
			
			List<Student> list = new ArrayList<Student>();
			list.add(new Student("nguyen van a ", 19,8.5));
			list.add(new Student("nguyen van teo", 29,3.5));
			list.add(new Student("hoang van d ", 22, 8.5));
			while(true) {
			int chon;
			int index;
			Scanner sc = new Scanner(System.in);
			
			
			
			
			System.out.print("\n1.INSERT ");
			System.out.print("\n2.DISPLAY ");
			System.out.print("\n3.REMOVE ");
			System.out.print("\n4.EDIT ");
			System.out.print("\n5.EXIT ");
			System.out.print("\nMoi ban chon: ");
			chon = sc.nextInt();
			switch(chon) {
			case 1: 
				val.add(list);
				break;
			case 2:
				val.display(list);
				break;
			case 3:
				System.out.println("input remove index: ");
				 index = sc.nextInt();
				val.remove(list, index);
				break;
				
			case 4:
				System.out.println("input edit index: ");
				index =sc.nextInt();
				val.edit(list, index);
				break;
				
			case 0:
				System.exit(0);
				break;
				}
			
			
				
			
			
			
		}
	}
}
