<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--  템플릿 해더 추가  -->
<!-- ./  상대주소  ./WEB-INF/views  <=>  /webapp/WEB-INF/views
     ../  절대주소  상위폴더로 이동    
      -->
	<%@include file="../include/header.jsp" %>

	<div class="content">
	<h1>/board/read.jsp</h1>
	
	${boardVO }
	
	<div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">게시판 본문보기</h3>
            </div>
            <!-- /.box-header -->
            
           
            <!-- form start -->
                     
              <div class="box-body">
                <div class="form-group">
                  <label for="exampleInputEmail1">번 호</label>
                  <input type="text" name="title" class="form-control" 
                         id="exampleInputEmail1" value="${boardVO.bno }" 
                         readonly="readonly">
                </div>
                
                <div class="form-group">
                  <label for="exampleInputEmail1">제  목</label>
                  <input type="text" name="title" class="form-control" 
                         id="exampleInputEmail1" value="${boardVO.title }" readonly>
                </div>
                
                <div class="form-group">
                  <label for="exampleInputEmail1">작성자</label>
                  <input type="text" name="writer" class="form-control" 
                         id="exampleInputEmail1" value="${boardVO.writer }" readonly>
                </div>
                
                <div class="form-group">
                  <label>내  용</label>
                  <textarea class="form-control" name="content" rows="3" 
                            readonly>${boardVO.content }</textarea>
                </div>
                
                <div class="form-group">
                  <label for="exampleInputEmail1">조회수</label>
                  <input type="text" name="writer" class="form-control" 
                         id="exampleInputEmail1" value="${boardVO.viewcnt }" readonly>
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">작성일</label>
                  <input type="text" name="writer" class="form-control" 
                         id="exampleInputEmail1" value="${boardVO.regdate }" readonly>
                </div>
                
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary">글쓰기</button>
                <button type="submit" class="btn btn-danger btn-lg">목록</button>
              </div>
         
          </div>

	</div> <!-- .content  -->
	<!-- jQuery 사용 -->
	<!-- 1)jquery 소스코드를 추가 -->

	<!-- 2)jquery 소스코드 사용 -->
	<script type="text/javascript">
	/*jquery : javascript에서 기능을 모아서 만든 것*/
		$(document).ready(function(){
			//=> 문서가 준비된 경우 실행하는 동작
			//=> 작성되는 코드 jquery 
			$(".btn-danger").click(function(){
			
				alert("게시판 목록으로 이동합니다.")
				
				//게시판 목록으로 이동
				location.href="/board/listALL"
			});// click
			
		}); // ready
	</script>

	<%@include file="../include/footer.jsp" %>
<!--  템플릿 푸더 추가  -->
	
	
	
