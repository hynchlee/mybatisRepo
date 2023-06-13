package com.kh.app.member.comtroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.service.MemberService;

@WebServlet("/member/delete")
public class MemberDeleteController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String no = req.getParameter("no");
		
		MemberService ms = new MemberService();
		int result = ms.deleteMember(no);
		
		resp.getWriter().write("실행결과 : " + result);
		
	}
	
}
