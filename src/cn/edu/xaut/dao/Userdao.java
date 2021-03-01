package cn.edu.xaut.dao;
import java.util.List;

//用用户名和密码检索数据库的表格
import cn.edu.xaut.bean.*;
public interface Userdao {
	Userbean findUser(String username,String password) ;//返回了个用户对象
	 List<Userbean> findAllUser() ;
}
