package Student;

public class Course{
	private int serialnumber; //课程编号
	private String CourseName; //课程名称
	private String LocationOfClass; //上课地点
	private String SchoolTime; //上课时间
	private String LectureTeacher; //授课教师
	public Course() {
		super(); //无参构造
		// TODO Auto-generated constructor stub
	}
	public Course(int serialnumber, String courseName, String locationOfClass, String schoolTime,
			String lectureTeacher) {
		super();//有参数的构造方法
		this.serialnumber = serialnumber;
		CourseName = courseName;
		LocationOfClass = locationOfClass;
		SchoolTime = schoolTime;
		LectureTeacher = lectureTeacher;
	}
	//get,set方法
	public int getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getLocationOfClass() {
		return LocationOfClass;
	}
	public void setLocationOfClass(String locationOfClass) {
		LocationOfClass = locationOfClass;
	}
	public String getSchoolTime() {
		return SchoolTime;
	}
	public void setSchoolTime(String schoolTime) {
		SchoolTime = schoolTime;
	}
	public String getLectureTeacher() {
		return LectureTeacher;
	}
	public void setLectureTeacher(String lectureTeacher) {
		LectureTeacher = lectureTeacher;
	}
	@Override//属性
	public String toString() {
		return "\n\n课程信息 :[课程编号：" + serialnumber + ", 课程名称：" + CourseName + ", 上课地点："
				+ LocationOfClass + ", 上课时间：" + SchoolTime + ", 授课老师：" + LectureTeacher + "]";
	}
	
	
}
