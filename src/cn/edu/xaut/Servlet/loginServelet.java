package cn.edu.xaut.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.xaut.bean.Userbean;
import cn.edu.xaut.dao.Userdao;
import cn.edu.xaut.dao.UserdaoIn;

/**
 * Servlet implementation class loginServelet
 */
@WebServlet("/loginServelet")
public class loginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//处理表单的控制器，提交表单时，username、password作为参数放到loginCheck()中
		System.out.println("aaaaaaaa");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		 
        if(loginCheck(username,password))
		{
			HttpSession session=request.getSession();
			session.setAttribute("logininfo",username);
			//request.getRequestDispatcher("manage.jsp").forward(request, response);
			response.sendRedirect("showAllStudent");//用来显示学生信息
		}
        else
        	response.sendRedirect("login.jsp");

        	//request.getRequestDispatcher("loginresult.jsp").forward(request, response);
        
		/*String check = request.getParameter("check");
		HttpSession session = request.getSession(true);
		request.setAttribute("data", username);
		if ("zhangsan".equals(username) && "123".equals(password)) {
			if ("on".equals(check)) {
				String loginCookie = username + "#" + password;
				Cookie cookie = new Cookie("loginCookie", loginCookie);
				cookie.setMaxAge(60 * 60 * 24 * 10);
				response.addCookie(cookie);
			}
			response.setContentType("Text/html");
			response.setCharacterEncoding("GBK");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>login success！</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>" + username + "登录成功</h1>");
			out.println("<h2>页面于\" " + "2s" + "\"后跳转</h2>");
			out.println("</body>");
			out.println("</html>");
			session.setAttribute("loginSession", username);
			request.getRequestDispatcher("manage.jsp").forward(request, response);// 。java中无法用javabean
			// response.setHeader("refresh", "2;URL=manage.jsp");
		} else {
			response.setContentType("Text/html");
			response.setCharacterEncoding("GBK");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>login failed！</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>" + username + "登录失败</h1>");
			out.println("<h2>页面于\" " + "2s" + "\"后跳转</h2>");
			out.println("</body>");
			out.println("</html>");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			// response.setHeader("refresh", "2;URL=login.jsp");
		}
*/
	}
	
	
	private boolean loginCheck(String username,String password) {
		try {
			Userdao user=new UserdaoIn();//实例化Userdao的接口
			Userbean ub=user.findUser(username, password);//用findUser实现数据的检索
			if(ub!=null) {
				System.out.println(ub.getUsername());
				return true;
			}
			else
				return false;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
/*	private boolean loginCheck(String username, String password) {
		try {

			Class.forName("com.mysql.jdbc.Driver");// 加载驱动 导入项目的时候导入到 WEB-INF下的lib
			String url = "jdbc:mysql://localhost:3306/Firstshuju";// url
			String user = "root";// 用户名
			String password1 = "521naikai";// 密码
			java.sql.Connection conn = DriverManager.getConnection(url, user, password1);// 建立连接
			String sql = "Select * from Student" + " where username=? and password=?;";// 用户名和密码作为参数传进来,注意空格
			java.sql.PreparedStatement pp = conn.prepareStatement(sql);

			pp.setString(1, username);
			pp.setString(2, password);
			// System.out.println(pp);
			ResultSet rs = pp.executeQuery();// 产看数据库是否有数据
			if (rs.next()) {
				// System.out.println(username+" "+password);

				return true;
			} else {
				// System.out.println("aaa");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}*/


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);//用上之后会出现乱码
	}

}
