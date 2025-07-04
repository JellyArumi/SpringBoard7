package com.itwillbs.domain;

import lombok.Data;

/**
 *	 페이징처리에 필요한 페이지번호, 페이지 사이즈를 
 *   저장하는 객체  
 */
//@Data
public class Criteria {
	
	private int page; 		// 페이지 번호
	private int pageSize;	// 페이지 크기
	
	public Criteria() {
		// 기본값으로 1페이지에 10개씩 출력
		System.out.println(" -------------- ");
		this.page = 1;
		this.pageSize = 10;
		System.out.println(" -------------- ");
	}

	// alt shift s + r
	public void setPage(int page) {
		if(page <= 0) {
			this.page = 1;
			return;
		}
		this.page = page;
	}
	public void setPageSize(int pageSize) {
		if(pageSize <= 0 || pageSize > 100) {
			pageSize = 10;
			return;
		}
		this.pageSize = pageSize;
	}	
	
	public int getPage() {
		return page;
	}
	public int getPageSize() {
		return pageSize;
	}
	
	// => mapper에서 #{pageStart} 실행될때 호출되는 구문
	public int getPageStart() {
		// 전달받은 페이지 정보를 조회할때 사용할 인덱스로 전환
		// 1페이지 -> index : 0
		// 2페이지 -> index : 10
		// 3페이지 -> index : 20
		
		return (this.page - 1) * pageSize;
	}
	

	// alt shift s + s
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", pageSize=" + pageSize + "]";
	}
		
	
}
