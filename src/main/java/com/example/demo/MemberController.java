package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.MemberListVO;
import com.example.demo.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberservice; 
	
	//메인페이지
	@GetMapping("/member/view")
	public String view(MemberListVO membervo) { // reponseEntity로 반환
		
		return "member/list"; // 출력
		
	}
	

	//회원 목록
	@GetMapping("/member/list")
	public ResponseEntity<Map<String, Object>> list(MemberListVO membervo) { // VO를 파라미터로 전달 service로
		
		Map<String, Object> result = new HashMap<>(); 
		result.put("list", memberservice.getList(membervo)); // 받는 타입 맞추고
		result.put("draw", membervo.getDraw());
		int count = memberservice.getTotalRecords();
		result.put("iTotalRecords", count);
		result.put("iTotalDisplayRecords", count);
		
		return ResponseEntity.ok(result); // 출력
		
	}
	
	
	//회원 등록 페이지
	@RequestMapping("/member/enroll")
	public String enroll() {
		
		System.out.println("회원등록페이지로 이동");
		return "member/enroll";

	}
	
	
	//회원 등록
	@RequestMapping("/member/enroll2")
	public ResponseEntity<String> enroll(MemberListVO member) {  // HTTP 요청(Request) 또는 응답(Response)에 해당하는 HttpHeader와 HttpBody를 포함하는 클래스
																 // Ajax로 String 보냈기 때문에 redirect x, ResponseEntity<String>
		memberservice.enroll(member);
		
		return ResponseEntity.ok("test");

	}
	
	
	// 회원 상세보기
	@RequestMapping("/member/detail")
	public ResponseEntity<Map<String, Object>> detail(MemberListVO membervo) {
		
		Map<String, Object> result = new HashMap<>();
		result.put("detail", memberservice.getDetail(membervo));
		
		System.out.println(result);
		return ResponseEntity.ok(result);
	
	}
	
	
	//회원 수정
	@RequestMapping("/member/modify")
	public ResponseEntity<String> modify(MemberListVO member) {  
																	 
		memberservice.modify(member);
			
		return ResponseEntity.ok("test");
			
	}
	
	
	//회원 삭제
	@RequestMapping("/member/delete")
	public ResponseEntity<String> delete(MemberListVO member) {  
																		 
		memberservice.delete(member);
				
		return ResponseEntity.ok("test");
				
	}
	
	

}
