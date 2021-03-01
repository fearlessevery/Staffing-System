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
 * Servlet implementation class UpdateStudentServlet
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*String yy=request.getParameter("id");//通过字段的内容得到参数
		int ID=Integer.parseInt(yy);
		//System.out.println("删除时："+ID);
		//ID=ID+8;
		Studentdao s=new Studentdaoin();//实现类实例化Studentdao的接口
		s.updateStudent(ID);
		List<StudentBean> list=s.findAllStudent();
		request.setAttribute("studentlist", list);//将list这个javabean对象利用setAttribute方法放进request里面
			//请求转发到manage页面，jsp收到request，也就是收到list里的studentlist值
		request.getRequestDispatcher("manage.jsp").forward(request, response);*/
		
		int ID=Integer.parseInt(request.getParameter("stuid"));//通过字段的内容得到参数
		String name=request.getParameter("stuname");//通过字段的内容得到参数
		String SCHOOL=request.getParameter("stuschool");//通过字段的内容得到参数
		String NUMBER=request.getParameter("stunumber");//通过字段的内容得到参数
		String EMAIL=request.getParameter("stuemail");//通过字段的内容得到参数
		String BIRTH=request.getParameter("stubirthday");//通过字段的内容得到参数
		//ID=ID+8;
		Studentdao s=new Studentdaoin();//实现类实例化Studentdao的接口
		s.updateStudent(ID,name,SCHOOL,NUMBER,EMAIL,BIRTH);
		List<StudentBean> list=s.findAllStudent();
		request.setAttribute("studentlist", list);
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
