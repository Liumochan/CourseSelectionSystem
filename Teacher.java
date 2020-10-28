package Student;

public class Teacher extends Personnel{
	
	private Course Course; //课程名称
	private String TitleName; //老师职称
	private String Department; //老师部门
	
	
	public Teacher(int number ,String name, String sex, int age) {
		super(number,name, sex, age);
		
	}
	public Course getCourse() {
		return Course;
	}
	public void setCourse(Course course) {
		Course = course;
	}
	public String getTitleName() {
		return TitleName;
	}
	public void setTitleName(String titleName) {
		TitleName = titleName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "教师信息:"+super.toString();
	}
	
	
	

	
	
	
}
