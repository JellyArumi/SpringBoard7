package com.itwillbs.domain;


/**
 * 페이징 블럭의 정보를 저장/ 계산하는 클래스 
 * 
 *
 */
public class PageVO {
	
	private int startPage;   //페이징 블럭 - 페이지 시작번호
	private int endPage;   //페이징 블럭 - 페이지 끝번호
	
	private int totalCount;  // 전체 데이터 개수
	
	private boolean prev;  //이전페이지
	private boolean next;  //다음페이지
	private int pageBlock = 10;  //페이징 블럭의 크기
	
	//private int page;   //페이지 번호
	//private int pageSize;  //페이지 사이즈
	
	private Criteria cri;  //페이지번호, 사이즈를 저장하는 객체


	
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		
		//페이징 블럭에 필요한 정보를 계산
		calcData();
	}

	////////////////////////////////////////////////////////////
	private void calcData() { //페이징 블럭에 필요한 정보를 계산 메서드
		//끝 페이지 번호(endPage)
		//  [endPage = (int)Math.ceil(페이지번호/(double)페이지사이즈)*페이지 사이즈]
		endPage = (int)(Math.ceil(cri.getPage() / (double)pageBlock) *pageBlock);
				
     	startPage = (endPage-pageBlock) +1; 
     	
     	int tmpEndPage = (int)Math.ceil(totalCount/(double)cri.getPageSize());
     	
     	if(endPage>tmpEndPage) {
     		endPage = tmpEndPage;
     	}
     	
     	prev = startPage !=1;
     	next = endPage*cri.getPageSize() <totalCount;
				
	}
	////////////////////////////////////////////////////////////
	
	public int getStartPage() {
		return startPage;
	}




	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}




	public int getEndPage() {
		return endPage;
	}




	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}




	public int getTotalCount() {
		return totalCount;
	}





	public boolean isPrev() {
		return prev;
	}



	public void setPrev(boolean prev) {
		this.prev = prev;
	}




	public boolean isNext() {
		return next;
	}




	public void setNext(boolean next) {
		this.next = next;
	}





	public int getPageBlock() {
		return pageBlock;
	}




	public void setPageBlock(int pageBlock) {
		this.pageBlock = pageBlock;
	}




	public Criteria getCri() {
		return cri;
	}


	@Override
	public String toString() {
		return "PageVO [startPage=" + startPage + ", endPage=" + endPage + ", totalCount=" + totalCount + ", prev="
				+ prev + ", next=" + next + ", pageBlock=" + pageBlock + ", cri=" + cri + "]";
	}
	
	
}
