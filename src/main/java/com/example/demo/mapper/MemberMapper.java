package com.example.demo.mapper;

import java.util.List;

import com.example.demo.domain.MemberListVO;

public interface MemberMapper {

	// 목록
	public List<MemberListVO> memberList(MemberListVO membervo);
	
	// 등록
	public void enroll(MemberListVO member);
	
	// 수정
	public void modify(MemberListVO member);
	
	// 삭제
	public void delete(MemberListVO member);
	
	//게시물 총 개수 가져오기
	public int recordsTotal();
	
	// 회원 상세정보 불러오기
	public MemberListVO memberDetail(MemberListVO membervo);
}
