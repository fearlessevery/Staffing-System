package cn.edu.xaut.dao;
import java.util.List;

//���û���������������ݿ�ı��
import cn.edu.xaut.bean.*;
public interface Userdao {
	Userbean findUser(String username,String password) ;//�����˸��û�����
	 List<Userbean> findAllUser() ;
}
