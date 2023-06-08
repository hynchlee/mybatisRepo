package com.kh.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.BoardVo;

public class BoardDao {

	public List<BoardVo> getBoardList(SqlSession ss) throws Exception {
		return ss.selectList("board.getBoardList");
	}

	public int write(SqlSession ss, BoardVo vo) {
		return ss.insert("board.write" , vo);
	}

	public BoardVo getBoardByNo(SqlSession ss, String no) {
		return ss.selectOne("board.getBoardByNo" , no);
	}

	public int deleteOneByNo(SqlSession ss, String no) {
		return ss.delete("board.delete", no);
	}

	public int updateTitle(BoardVo vo, SqlSession ss) {
		return ss.update("board.update", vo);
	}

}











