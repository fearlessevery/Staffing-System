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
 * Servlet implementation class showAllStudent
 */
@WebServlet("/showAllStudent")
public class showAllStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showAllStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Studentdao s=new Studentdaoin();//实现类实例化Studentdao的接口
		List<StudentBean> list=s.findAllStudent();
		if(list!=null) {
			request.setAttribute("studentlist", list);//将list这个javabean对象利用setAttribute方法放进request里面
			//请求转发到manage页面，jsp收到request，也就是收到list里的studentlist值
			request.getRequestDispatcher("manage.jsp").forward(request, response);
		}
		else
			response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
