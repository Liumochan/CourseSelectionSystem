package Student;

public class Personnel {
	private int number; //编号
	private String name;
	private String sex;
	private int age;
	public Personnel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personnel(int number, String name, String sex, int age) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[编号：" + number + ", 姓名：" + name + ", 性别：" + sex + ", 年龄：" + age + "]";
	}
	

}
