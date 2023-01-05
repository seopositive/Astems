package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import vo.AstemsUserVO;

@WebServlet("/loginCtrl.do")
public class login extends HttpServlet {

	
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

		
		UserDAO dao = new UserDAO();
		AstemsUserVO bean = dao.userlogin(id, pw);
		
		
		if(bean != null){
			// 세션 설정
			HttpSession session = request.getSession();
			// 세션 저장
			session.setAttribute("logid", bean.getId());
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	
	}

}
