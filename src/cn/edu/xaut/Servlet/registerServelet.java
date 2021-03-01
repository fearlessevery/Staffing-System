package cn.edu.xaut.Servlet;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registerServelet
 */
@WebServlet("/registerServelet")
public class registerServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//.getWriter().append("Served at: ").append(request.getContextPath());
				try {
					Class.forName("com.mysql.jdbc.Driver");//加载驱动     导入项目的时候导入到 WEB-INF下的lib
					String url="jdbc:mysql://localhost:3306/Firstshuju";//url
					String user="root";//用户名
					String password1="521naikai";//密码
					java.sql.Connection conn=DriverManager.getConnection(url, user, password1);//建立连接
					String sql="insert into Student"+"(username,realname,password,dept,tel,email)"+"values(?,?,?,?,?,?);";//id自动生成，否则防止插不进去
					java.sql.PreparedStatement pp=conn.prepareStatement(sql);
					
					pp.setString(1,request.getParameter("username") );
					pp.setString(2,request.getParameter("realname") );
					pp.setString(3, request.getParameter("password"));
					pp.setString(4, request.getParameter("partment"));
					pp.setString(5, request.getParameter("telnumber"));
					pp.setString(6, request.getParameter("emialaddress"));
			
					int row=pp.executeUpdate();//实现记录的插入
					if(row>0)
						request.getRequestDispatcher("zhucehou.jsp").forward(request, response);
					else
						request.getRequestDispatcher("RegError.jsp").forward(request, response);
					}catch(Exception e) {
						e.printStackTrace();
						request.getRequestDispatcher("RegError.jsp").forward(request, response);
					}
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
