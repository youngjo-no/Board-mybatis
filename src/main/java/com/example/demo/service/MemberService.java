package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.MemberListVO;
//import com.example.demo.mapper.MemberMapper;
import com.example.demo.mapper.MemberMapper;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
//@AllArgsConstructor
public class MemberService {

	@Autowired
	private MemberMapper mapper;

	
	// 회원 목록
	public List<MemberListVO> getList(MemberListVO membervo) { // 받는 타입 맞춰주고

		return mapper.memberList(membervo);

	}

	
	// 회원 등록
	public void enroll(MemberListVO member) {
		
		mapper.enroll(member);
	}
	
	
	// 회원 수정
	public void modify(MemberListVO member) {
			
		mapper.modify(member);
		
	}
	
	// 회원 삭제
	public void delete(MemberListVO member) {
				
		mapper.delete(member);
			
	}
	
	
	// 게시물 총 개수 가져오기
	public int getTotalRecords(){
		
		return mapper.recordsTotal();
		
	}
	
	
	// 회원 상세 정보 불러오기
	public MemberListVO getDetail(MemberListVO membervo) { // 받는 타입 맞춰주고
	
		return mapper.memberDetail(membervo);

	}
		
	
		
	

}
