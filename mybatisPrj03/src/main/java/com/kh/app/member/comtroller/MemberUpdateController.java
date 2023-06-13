package com.kh.app.member.comtroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/update")
public class MemberUpdateController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String nick = req.getParameter("nick");
		String pwd = req.getParameter("pwd");
		String no = req.getParameter("no");
		
		MemberVo vo = new MemberVo();
		vo.setNick(nick);
		vo.setPwd(pwd);
		vo.setNo(no);
		
		MemberService ms = new MemberService();
		int result = ms.updateMember(vo);
		
		resp.getWriter().write("실행결과 : " + result);
		
	}
	
}
