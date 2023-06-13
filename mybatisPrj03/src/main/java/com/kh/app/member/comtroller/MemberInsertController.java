package com.kh.app.member.comtroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.IDebugRequestor;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/insert")
public class MemberInsertController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String nick = req.getParameter("nick");
		String profile = req.getParameter("profile");
		String hobby = req.getParameter("hobby");
		
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);
		vo.setNick(nick);
		vo.setProfile(profile);
		vo.setHobby(hobby);
		
		MemberService ms = new MemberService();
		int result = ms.insertMember(vo);
		
		resp.getWriter().write("실행결과 : " + result);
		
	}
	
}
