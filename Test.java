package Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher A1=new Teacher(01, "李易峰", "男", 28);
		Student B1=new Student(02, "王俊凯","男",20);
		Course C1=new Course(999, null, "实验一楼", "7:30", "李易峰");//初始化对象
		   A1.setCourse(C1);//设置参数
		   B1.setCourses(C1);
		//逻辑运算，如果这个学生获取课程名称,课程名称为空。说明这个学生已退课 
		if(B1.getCourses().getCourseName()==null) {
			
		     System.out.println("学生已经退课");
		     
		}else 
			
		{
			                     
		System.out.println(A1);
		System.out.println(B1);}
		   
		
	}

}
