package com.kh.app.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;

@WebServlet("/board/delete")
public class BoardDeleteController extends HttpServlet{

	// DELETE FROM BOARD WHERE NO = ?
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데꺼
		String no = req.getParameter("no");
		
		//서비스
		BoardService bs = new BoardService();
		int result = bs.deleteOneByNo(no);
		
		//화면
		resp.getWriter().write("실행결과 : " + result);
		
	}
	
}
