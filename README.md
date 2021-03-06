##计G201 刘园园 2020322078

# CourseSelectionSystem

## 1.实验目的：
    （1）.掌握Java语言的编程技巧，能够独立进行面向对象的开发能力。
    （2）.学会使用java编写简单的类，理解类的属性与方法，熟悉java的构造方法。
    （3）.了解分析系统需求，从教师信息、学生信息和课程信息角度了解系统中的实体及其关系，学会定义类中的属性以及方法。
    （4）.学会使用super(),实例化子类的对象。
    （5）.掌握类的继承，子类可以获得父类所有的属性和方法，子类总以父类为基础增加新的属性和方法。通过构造方法实例化对象。
    （6）.Object类具有一个toString()方法，创建的每个类继承该方法。
## 2.实验要求：
     (1). 定义了人员、教师信息、学生课程信息、学生选课信息、学生退课信息。
     (2). 每名老师有一个编号，教一门课程和所授课程名称。每名学生也有一个编号，仅选一门课程学习和所选课程名称。
     (3). 在人员、教师、学生类中分别定义了编号、姓名、性别、和年龄。
     (4). 并在测试类中实例化了多个类实体（包括了课程编号、课程名称、上课地点、上课时间、授课老师）。
## 3.实验过程：
     创建Personnel,Teacher,Student,Course,Text五个类，满足以下要求：
     (1). 先建一个Personnel类，personnel是父类。定义了 编号、姓名、性别、年龄。设置set/get方法，使用toString方法打印输出。创建有参和无参构造方法。
     (2). 老师模块-子类
          建一个Teacher类，teacher是子类。teacher继承了父类的编号、姓名、性别、年龄，又定义了课程名称、老师职称、老师部门3个属性。设置set/get方法，使用toString方法打印输           出。创建有参和无参构造方法。
     (3). 学生模块-子类
          建一个Student类，student是子类。student继承了父类的编号、姓名、性别、年龄，又定义了学生所选的课程信息。设置set/get方法，使用toString方法打印输出。创建有参和无           参构造法。
     (4). 选课信息
          课程编号、课程名称、上课地点、上课时间、授课教师。设置set/get方法，使用toString方法打印输出。创建有参和无参构造方法。
     (5). 测试类
          实例化对象，赋值。输出学生选课信息。
## 4.核心代码：
     if(B1.getCourses().getCourseName()==null) {
	  System.out.println("学生已经退课");
     }else {
         System.out.println(A1);
	 System.out.println(B1);
	 }
		   }
		   
## 5.系统运行截图：
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/ysAZ3LyGh0MczupEarmpLAHFeen8VUibdKJhbQFQbWvClRN8l2EDK3ibITkMbBNHLv/0)
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/ysAZ3LyGh0MczupEarmpLAHFeen8VUibdEYlXWyNuRfX8CuF5LaVOq3Uew0UBSd1J/0)
## 6.编程感想:
     (1). 在该实验中，学会定义类中的属性和方法。学会使用super()、get,set方法、掌握类的继承用法并在测试类中实例化了多个类实体。
     (2). 我碰到的问题是逻辑运算，如何模拟学生退课操作。解决方法是通过查阅资料书和网上搜索相关解决方法及同学的有力帮助。  
