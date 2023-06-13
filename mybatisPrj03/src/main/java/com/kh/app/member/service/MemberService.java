package com.kh.app.member.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.MybatisTemplate;
import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;

public class MemberService {

	private final MemberDao dao = new MemberDao();

	
	public List<MemberVo> getMemberList(String[] numArr) {

		SqlSession ss = MybatisTemplate.getSqlSession();
		
		List<MemberVo> voList = dao.getMemberList(numArr, ss);
		
		return voList;
	}


	public MemberVo getMemberOneByNo(String no) {

		SqlSession ss = MybatisTemplate.getSqlSession();
		
		MemberVo vo = dao.getMemberOneByNo(no, ss);
		
		return vo;
		
	}


	public int insertMember(MemberVo vo) {

		SqlSession ss = MybatisTemplate.getSqlSession();
		
		int result = dao.insertMember(vo, ss);
		
		if(result == 1) {
			ss.commit();
		}
		else {
			ss.rollback();
		}
		
		ss.close();
		
		return result;
	}


	public int deleteMember(String no) {

		SqlSession ss = MybatisTemplate.getSqlSession();
		
		int result = dao.deleteMember(no, ss);
		
		if(result == 1) {
			ss.commit();
		}
		else {
			ss.rollback();
		}
		
		ss.close();
		
		return result;
		
	}


	public int updateMember(MemberVo vo) {

		SqlSession ss = MybatisTemplate.getSqlSession();
		
		int result = dao.updateMember(vo, ss);
		
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
