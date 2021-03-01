package cn.edu.xaut.dao;

import java.util.List;

import org.junit.Test;

import cn.edu.xaut.bean.StudentBean;
import cn.edu.xaut.bean.Userbean;
public class Testt {
	@Test
	public void test1() {
		Studentdao s=new Studentdaoin();//实现类实例化Studentdao的接口
		List<StudentBean> list=s.findAllStudent();
		for(StudentBean i:list) {
			System.out.println(i);
		}
	}
	@Test
	public void test2() {
		Userdao u=new UserdaoIn();
		Userbean  ub=u.findUser("zhangsan", "123");
		if(ub!=null)
			System.out.println(ub.getUsername());
	}
}
