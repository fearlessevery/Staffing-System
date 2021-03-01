package cn.edu.xaut.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import cn.edu.xaut.bean.StudentBean;
import cn.edu.xaut.bean.Userbean;
import cn.edu.xaut.util.Util;

public  class UserdaoIn implements Userdao{//ʵ����Userdao����ӿ�

	@Override
	public Userbean findUser(String username, String password) {
		// TODO Auto-generated method stub
		Userbean user=null;
		Connection conn=null;
		PreparedStatement prep=null;
		ResultSet rs=null;
		String sql="select * from Student where username=? and password=?;";//��Student���в����û���������
		try {
			conn=Util.getConnection();//���ù���������������
			prep=conn.prepareStatement(sql);
			prep.setString(1,username);
			prep.setString(2,password);
			rs=prep.executeQuery();//��ѯ�Ľ�����ص�rs��
			//System.out.println(rs.next());
			if(rs.next()) {//��userʵ��������ֵ�����Ǿݿ��еĶ���ŵ�user
				user=new Userbean();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setRealname(rs.getString("realname"));
				user.setPassword(rs.getString("password"));
				user.setPartment(rs.getString("dept"));
				System.out.println("sicccess");
			}
			//System.out.println("fail");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Util.close(conn);
		}
		return user;
	}

	@Override
	public List<Userbean> findAllUser() {
		// TODO Auto-generated method stub
		List<Userbean> list=null;
		String sql="select * from Student;";//��Student���в����û���������
		Connection conn=null;
		PreparedStatement prep=null;
		ResultSet rs=null;
		
		try {
			list=new ArrayList<Userbean>();
			conn=Util.getConnection();//���ù���������������
			prep=conn.prepareStatement(sql);
			rs=prep.executeQuery();//��ѯ�Ľ�����ص�rs��
			while(rs.next()) {//��userʵ��������ֵ�����Ǿݿ��еĶ���ŵ�user
				Integer userId=rs.getInt("id");
				String userName=rs.getString("username");
				String realName=rs.getString("realname");
				String passWord=rs.getString("password");
				String stuDept=rs.getString("dept");
				String Tel=rs.getString("tel");
				String Email=rs.getString("email");
				Userbean ss=new Userbean();
				ss.setId(userId);
				ss.setUsername(userName);
				ss.setRealname(realName);
				ss.setPartment(stuDept);
				ss.setPassword(passWord);
				ss.setTelnumber(Tel);
				ss.setEmialaddress(Email);
				list.add(ss);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Util.close(conn);
		}
		return list;//ע������Ҫ���ؽ������б�
	}

}
