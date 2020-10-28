package Student;

public class Student extends Personnel{
	
	private Course Courses; //所选课程

	public Student() {
		super();//无参构造
		// TODO Auto-generated constructor stub
	}
	//有参数的构造方法
	public Student(int number, String name, String sex, int age) {
		super(number, name, sex, age);
	}
	//get,set方法
	public Course getCourses() {
		return Courses;
	}

	public void setCourses(Course Courses) {
		this.Courses = Courses;
	}

	@Override
	public String toString() {
		return "\n学生信息 :"+super.toString()+Courses;
	}
	

}
