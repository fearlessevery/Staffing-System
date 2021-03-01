package cn.edu.xaut.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.xaut.bean.StudentBean;
import cn.edu.xaut.dao.Studentdao;
import cn.edu.xaut.dao.Studentdaoin;

/**
 * Servlet implementation class addStudentServlet
 */
@WebServlet("/addStudentServlet")
public class addStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*String ss=request.getParameter("add");//通过字段的内容得到参数
		Studentdao s=new Studentdaoin();//实现类实例化Studentdao的接口
		s.addStudent(ss);
		List<StudentBean> list=s.findAllStudent();
		request.setAttribute("studentlist", list);
		//请求转发到manage页面，jsp收到request，也就是收到list里的studentlist值
		request.getRequestDispatcher("manage.jsp").forward(request, response);*/
		
		String ss1=request.getParameter("id");//通过字段的内容得到参数
		String ss2=request.getParameter("name");
		String ss3=request.getParameter("collage");
		String ss4=request.getParameter("telnumber");
		String ss5=request.getParameter("emialaddress");
		String ss6=request.getParameter("birthday");
		String ss7=request.getParameter("logintime");
		Studentdao s=new Studentdaoin();//实现类实例化Studentdao的接口
		System.out.println("xxxxx"+ss1+ss2+ss3+ss4+ss5+ss6+ss7);
		s.addStudentt(ss1,ss2,ss3,ss4,ss5,ss6,ss7);
		List<StudentBean> list=s.findAllStudent();
		request.setAttribute("studentlist", list);
		//请求转发到manage页面，jsp收到request，也就是收到list里的studentlist值
		request.getRequestDispatcher("manage.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
