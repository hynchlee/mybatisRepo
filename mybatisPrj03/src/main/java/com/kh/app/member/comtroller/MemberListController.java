package com.kh.app.member.comtroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/list")
public class MemberListController extends HttpServlet{

	//SELECT * FROM MEMBER
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[] numArr = req.getParameterValues("num");
		
//		if(numArr == null) {
//			numArr = new String[] {};
//		}
		
		//회원 전체를 조회하는 기능
		MemberService ms = new MemberService();
		List<MemberVo> voList = ms.getMemberList(numArr);
		
		resp.getWriter().write(voList.toString());
		
	}
	
}
