package cn.edu.xaut.util;
//工具类
import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
	private static Connection cp;

	public static Connection getConnection() {//建立连接
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Firstshuju?characterEncoding=UTF-8";//url
			String user="root";//用户名
			String password1="521naikai";//密码
		    cp=(Connection)DriverManager.getConnection(url, user, password1);//建立连接
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//加载驱动     导入项目的时候导入到 WEB-INF下的lib
		return cp;
	}

	public static void close(Connection conn) {//关闭连接
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
			System.out.println(getConnection());//用来测试，数出对象
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
