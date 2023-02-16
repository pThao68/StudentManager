
public class Student {

	private String name;
	private int age;
	private double mark;
	
	
	public Student() {
		super();
	}
	public Student(String name, int age, double mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return name + "\t" + age + "\t" + mark ;
	}
	
	
	
}
