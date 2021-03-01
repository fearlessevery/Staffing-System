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
		/*String yy=request.getParameter("id");//ͨ���ֶε����ݵõ�����
		int ID=Integer.parseInt(yy);
		//System.out.println("ɾ��ʱ��"+ID);
		//ID=ID+8;
		Studentdao s=new Studentdaoin();//ʵ����ʵ����Studentdao�Ľӿ�
		s.updateStudent(ID);
		List<StudentBean> list=s.findAllStudent();
		request.setAttribute("studentlist", list);//��list���javabean��������setAttribute�����Ž�request����
			//����ת����manageҳ�棬jsp�յ�request��Ҳ�����յ�list���studentlistֵ
		request.getRequestDispatcher("manage.jsp").forward(request, response);*/
		
		int ID=Integer.parseInt(request.getParameter("stuid"));//ͨ���ֶε����ݵõ�����
		String name=request.getParameter("stuname");//ͨ���ֶε����ݵõ�����
		String SCHOOL=request.getParameter("stuschool");//ͨ���ֶε����ݵõ�����
		String NUMBER=request.getParameter("stunumber");//ͨ���ֶε����ݵõ�����
		String EMAIL=request.getParameter("stuemail");//ͨ���ֶε����ݵõ�����
		String BIRTH=request.getParameter("stubirthday");//ͨ���ֶε����ݵõ�����
		//ID=ID+8;
		Studentdao s=new Studentdaoin();//ʵ����ʵ����Studentdao�Ľӿ�
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
