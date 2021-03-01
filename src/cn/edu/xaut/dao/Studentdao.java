package cn.edu.xaut.dao;

import java.util.List;

import cn.edu.xaut.bean.StudentBean;

public interface Studentdao {
	List<StudentBean> findAllStudent();//从Student表中检索出所有数据
	List<StudentBean> SearchStudent(String str);//按姓名检索
	boolean deleteStudent(int id);//将学号为id的学生删除
	boolean updateStudent(int id,String a,String b,String c,String d,String e);//将学号为id的学生学号自动加8
    boolean addStudentt(String a,String b,String c,String d,String e,String f,String g);
	
	/*boolean addStudent(String  jilu);//将学号为id的学生学号自动加8
*/	
}
