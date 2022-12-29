package com.example.demo.domain;

import lombok.Data;

@Data
public class DataTableVO {
	
	private int draw;    // 응답하는 draw count
	private int start;   // 페이징 첫번째 레코드 표시기, 현재 데이터 세트의 시작점
	private int length;  // 테이블이 그리기에서 표시할 수 있는 레코드 수
	private int recordsTotal; // 데이터 총 개수

	
}
