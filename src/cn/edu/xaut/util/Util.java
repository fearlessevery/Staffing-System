package cn.edu.xaut.util;
//������
import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
	private static Connection cp;

	public static Connection getConnection() {//��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Firstshuju?characterEncoding=UTF-8";//url
			String user="root";//�û���
			String password1="521naikai";//����
		    cp=(Connection)DriverManager.getConnection(url, user, password1);//��������
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//��������     ������Ŀ��ʱ���뵽 WEB-INF�µ�lib
		return cp;
	}

	public static void close(Connection conn) {//�ر�����
		if(conn!=null)
		{
			try {
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(getConnection());//�������ԣ���������
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
