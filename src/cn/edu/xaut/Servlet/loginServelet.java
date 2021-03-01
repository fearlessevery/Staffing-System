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
		//������Ŀ��������ύ��ʱ��username��password��Ϊ�����ŵ�loginCheck()��
		System.out.println("aaaaaaaa");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		 
        if(loginCheck(username,password))
		{
			HttpSession session=request.getSession();
			session.setAttribute("logininfo",username);
			//request.getRequestDispatcher("manage.jsp").forward(request, response);
			response.sendRedirect("showAllStudent");//������ʾѧ����Ϣ
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
			out.println("<title>login success��</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>" + username + "��¼�ɹ�</h1>");
			out.println("<h2>ҳ����\" " + "2s" + "\"����ת</h2>");
			out.println("</body>");
			out.println("</html>");
			session.setAttribute("loginSession", username);
			request.getRequestDispatcher("manage.jsp").forward(request, response);// ��java���޷���javabean
			// response.setHeader("refresh", "2;URL=manage.jsp");
		} else {
			response.setContentType("Text/html");
			response.setCharacterEncoding("GBK");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>login failed��</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>" + username + "��¼ʧ��</h1>");
			out.println("<h2>ҳ����\" " + "2s" + "\"����ת</h2>");
			out.println("</body>");
			out.println("</html>");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			// response.setHeader("refresh", "2;URL=login.jsp");
		}
*/
	}
	
	
	private boolean loginCheck(String username,String password) {
		try {
			Userdao user=new UserdaoIn();//ʵ����Userdao�Ľӿ�
			Userbean ub=user.findUser(username, password);//��findUserʵ�����ݵļ���
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

			Class.forName("com.mysql.jdbc.Driver");// �������� ������Ŀ��ʱ���뵽 WEB-INF�µ�lib
			String url = "jdbc:mysql://localhost:3306/Firstshuju";// url
			String user = "root";// �û���
			String password1 = "521naikai";// ����
			java.sql.Connection conn = DriverManager.getConnection(url, user, password1);// ��������
			String sql = "Select * from Student" + " where username=? and password=?;";// �û�����������Ϊ����������,ע��ո�
			java.sql.PreparedStatement pp = conn.prepareStatement(sql);

			pp.setString(1, username);
			pp.setString(2, password);
			// System.out.println(pp);
			ResultSet rs = pp.executeQuery();// �������ݿ��Ƿ�������
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
		//doGet(request, response);//����֮����������
	}

}
