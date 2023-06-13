package com.kh.app.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.member.vo.MemberVo;

public class MemberDao {

	public List<MemberVo> getMemberList(String[] numArr, SqlSession ss) {
		return ss.selectList("member.getMemberList", numArr);
	}

	public MemberVo getMemberOneByNo(String no, SqlSession ss) {
		return ss.selectOne("member.getMemberOneByNo", no);
	}

	public int insertMember(MemberVo vo, SqlSession ss) {
		return ss.insert("member.insertMember", vo);
	}

	public int deleteMember(String no, SqlSession ss) {
		return ss.delete("member.quit", no);
	}

	public int updateMember(MemberVo vo, SqlSession ss) {
		return ss.update("member.updateMember", vo);
	}

}

