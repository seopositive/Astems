package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import vo.AstemsUserVO;


@WebServlet("/JoinCtrl.do")
public class Join extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dogetPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dogetPost(request, response);
	}
	
protected void dogetPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pw2 = request.getParameter("pw2");
		String name = request.getParameter("name");
		
		AstemsUserVO bean = new AstemsUserVO();
		
		bean.setId(id);
		bean.setPw(pw);
		bean.setName(name);
		
		if(pw.equals(pw2)) {
			UserDAO dao = new UserDAO();
			dao.joinuser(bean);
			
			// 포워딩
			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);			
		} else {
			response.sendRedirect("join.jsp");
		}
		
	}

}
