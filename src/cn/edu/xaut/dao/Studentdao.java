package cn.edu.xaut.dao;

import java.util.List;

import cn.edu.xaut.bean.StudentBean;

public interface Studentdao {
	List<StudentBean> findAllStudent();//��Student���м�������������
	List<StudentBean> SearchStudent(String str);//����������
	boolean deleteStudent(int id);//��ѧ��Ϊid��ѧ��ɾ��
	boolean updateStudent(int id,String a,String b,String c,String d,String e);//��ѧ��Ϊid��ѧ��ѧ���Զ���8
    boolean addStudentt(String a,String b,String c,String d,String e,String f,String g);
	
	/*boolean addStudent(String  jilu);//��ѧ��Ϊid��ѧ��ѧ���Զ���8
*/	
}
