package com.kh.app.board.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.template.JDBCTemplate;
import com.kh.app.template.MybatisTemplate;

public class BoardService {

	public List<BoardVo> getBoardList() throws Exception {
		//conn
		SqlSession ss = MybatisTemplate.getSqlSession();
		
		BoardDao dao = new BoardDao();
		List<BoardVo> voList = dao.getBoardList(ss);
		
		//close
		ss.close();
		
		return voList;
	}

	public int write(BoardVo vo) {
		
		//conn
		SqlSession ss = MybatisTemplate.getSqlSession();
		
		//SQL
		BoardDao dao = new BoardDao();
		int result = dao.write(ss , vo);
		
		//tx || rs
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		
		//close
		ss.close();
		
		return result;
	}

	public BoardVo getBoardByNo(String no) {
		// conn
		SqlSession ss = MybatisTemplate.getSqlSession();
		
		BoardDao dao = new BoardDao();
		BoardVo vo = dao.getBoardByNo(ss , no);
		
		// SQL
		// tx || rs
		
		// close
		ss.close();
		
		return vo;
	}

	public int deleteOneByNo(String no) {

		SqlSession ss = MybatisTemplate.getSqlSession();
		
		BoardDao dao = new BoardDao();
		int result = dao.deleteOneByNo(ss, no);
		
		if(result == 1) {
			ss.commit();
		}
		else {
			ss.rollback();
		}
		
		ss.close();
		
		return result;
	}

	public int updateTitle(BoardVo vo) {

		SqlSession ss = MybatisTemplate.getSqlSession();
		
		BoardDao dao = new BoardDao();
		int result = dao.updateTitle(vo, ss);
		
		if(result == 1) {
			ss.commit();
		}
		else {
			ss.rollback();
		}
		
		ss.close();
		
		return result;
		
	}

}



















