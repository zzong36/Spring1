package kr.ac.kopo.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.member.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public MemberVO selectUser(MemberVO member) {
		MemberVO user =new MemberVO();
		user = sqlSessionTemplate.selectOne("member.dao.memberDAO.selectUser", member);
		return user;
	}
	
	public void insertUser(MemberVO member) {
		sqlSessionTemplate.insert("member.dao.memberDAO.insertUser", member);
	}

}
