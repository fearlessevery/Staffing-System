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

public class Studentdaoin implements Studentdao{
	@Override
	public List<StudentBean> findAllStudent() {
		// TODO Auto-generated method stub
		List<StudentBean> list=null;
		String sql="select * from stu;";//��Student���в����û���������
		Connection conn=null;
		PreparedStatement prep=null;
		ResultSet rs=null;
		
		try {
			list=new ArrayList<StudentBean>();
			conn=Util.getConnection();//���ù���������������
			prep=conn.prepareStatement(sql);
			rs=prep.executeQuery();//��ѯ�Ľ�����ص�rs��
			while(rs.next()) {//��userʵ��������ֵ�����Ǿݿ��еĶ���ŵ�user
				Integer stuId=rs.getInt("stuid");
				String stuName=rs.getString("stuname");
				String stuColledg=rs.getString("stucolledg");
				String stuTel=rs.getString("stutel");
				String stuEmail=rs.getString("stuemail");
				Date Birthday=rs.getDate("birthday");
				Timestamp Lasttime=rs.getTimestamp("lasttime");
				StudentBean ss=new StudentBean();
				ss.setStuid(stuId);
				ss.setStuname(stuName);
				ss.setStucolledg(stuColledg);
				ss.setStutel(stuTel);
				ss.setStuemail(stuEmail);
				ss.setBirthday(Birthday);
				ss.setLasttime(Lasttime);
				
				list.add(ss);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Util.close(conn);
		}
		return list;//ע������Ҫ���ؽ������б�
	}

	@Override
	public List<StudentBean> SearchStudent(String str) {
		// TODO Auto-generated method stub
			List<StudentBean> list=null;
			String sql="select * from stu where stuname like ?;";//��Student���в����û���������
			Connection conn=null;
			PreparedStatement prep=null;
			ResultSet rs=null;
			
			try {
				list=new ArrayList<StudentBean>();
				conn=Util.getConnection();//���ù���������������
				str="%"+str+"%";
				prep=conn.prepareStatement(sql);
				prep.setString(1, str);
				rs=prep.executeQuery();//��ѯ�Ľ�����ص�rs��
				//System.out.println(prep);
				while(rs.next()) {//��userʵ��������ֵ�����Ǿݿ��еĶ���ŵ�user
					Integer stuId=rs.getInt("stuid");
					String stuName=rs.getString("stuname");
					String stuColledg=rs.getString("stucolledg");
					String stuTel=rs.getString("stutel");
					String stuEmail=rs.getString("stuemail");
					Date Birthday=rs.getDate("birthday");
					Timestamp Lasttime=rs.getTimestamp("lasttime");
					StudentBean ss=new StudentBean();
					ss.setStuid(stuId);
					ss.setStuname(stuName);
					ss.setStucolledg(stuColledg);
					ss.setStutel(stuTel);
					ss.setStuemail(stuEmail);
					ss.setBirthday(Birthday);
					ss.setLasttime(Lasttime);	
					list.add(ss);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				Util.close(conn);
			}
			return list;//ע������Ҫ���ؽ������б�
	}

/*	@Override
	public boolean updateStudent(int id) {
		// TODO Auto-generated method stub
			
			}*/
	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
				List<StudentBean> list=null;
				String sql="delete  from stu where stuid=?;";//��Student����ɾ��ѧ��Ϊ����ѧ��
				Connection conn=null;
				PreparedStatement prep=null;
				boolean b=false;				
				try {					
					conn=Util.getConnection();//���ù���������������
					prep=conn.prepareStatement(sql);
					prep.setInt(1, id);
					int row=prep.executeUpdate();//��ѯ�Ľ�����ص�rs��
					if(row>0)
						b=true;
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					Util.close(conn);
				}
				return b;//ע������Ҫ���ؽ������б�	
			}

/*	@Override
	public boolean addStudent(String jilu) {
		// TODO Auto-generated method stub
		//System.out.println(jilu);
		List<StudentBean> list=null;
		String sql="insert into stu values(?,?,?,?,?,?,?);";//��Student���в����û���������
		Connection conn=null;
		PreparedStatement prep=null;
		boolean b=false;
		try {
			//list=new ArrayList<StudentBean>();
			conn=Util.getConnection();//���ù���������������
			//jilu="%"+jilu+"%";
			 String[] strArr = jilu.split(" ");
		        System.out.println(strArr.length); //�������3
		        for (int i = 0; i < strArr.length; ++i){
		        System.out.println(strArr[i]);//�������a b c
		      }
		    int a=Integer.parseInt(strArr[0]);
			prep=conn.prepareStatement(sql);
			prep.setInt(1, a);
			prep.setString(2, strArr[1]);
			prep.setString(3, strArr[2]);
			prep.setString(4, strArr[3]);
			prep.setString(5, strArr[4]);
			prep.setString(6, strArr[5]);
			prep.setString(7, strArr[6]);
			int row=prep.executeUpdate();//��ѯ�Ľ�����ص�rs��
			System.out.println(prep);
			if(row>0)
				b=true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Util.close(conn);
		}
		return b;
	}*/

	@Override
	public boolean addStudentt(String a, String b, String c, String d, String e, String f, String g) {
		// TODO Auto-generated method stub
/*		System.out.println("bbbbb:"+a+b+c+d+e+f+g);
*/		List<StudentBean> list=null;
		String sql="insert into stu values(?,?,?,?,?,?,?);";//��Student���в����û���������
		Connection conn=null;
		PreparedStatement prep=null;
		boolean bb=false;
		try {
			conn=Util.getConnection();//���ù���������������
			int aa=Integer.parseInt(a);
			prep=conn.prepareStatement(sql);
			prep.setInt(1, aa);
			prep.setString(2, b);
			prep.setString(3, c);
			prep.setString(4, d);
			prep.setString(5, e);
			prep.setString(6, f);
			prep.setString(7, g);
			int row=prep.executeUpdate();//��ѯ�Ľ�����ص�rs��
			System.out.println(prep);
			if(row>0) {
/*				System.out.println("cccc:"+a+b+c+d+e+f+g);
*/				bb=true;
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			Util.close(conn);
		}
		return false;
	}

	@Override
	public boolean updateStudent(int id, String a, String b, String c, String d, String e) {
		// TODO Auto-generated method stub
		List<StudentBean> list=null;
		String sql="update stu set stuname=?, stucolledg=? , stutel=? , stuemail=? , birthday=? where stuid=?;";//��Student���и���ѧ��Ϊ����ѧ��ѧ�ţ�����8
		Connection conn=null;
		PreparedStatement prep=null;
		boolean bb=false;				
		try {					
			conn=Util.getConnection();//���ù���������������
			prep=conn.prepareStatement(sql);			
			prep.setString(1, a);
			prep.setString(2, b);
			prep.setString(3, c);
			prep.setString(4, d);
			prep.setString(5, e);
			prep.setInt(6, id);
			int row=prep.executeUpdate();//��ѯ�Ľ�����ص�rs��
			if(row>0)
				bb=true;
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			Util.close(conn);
		}
		return bb;//ע������Ҫ���ؽ������б�	
	}
}
