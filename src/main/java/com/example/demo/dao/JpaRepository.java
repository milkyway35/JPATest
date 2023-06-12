package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Board;

@Repository
public interface JpaRepository extends CrudRepository<Board, Integer>{

//	public Board save(Board board);				// 글작성, 글수정 (생략)
	
//	public long count();						// 글 갯수 (생략)
	
	@Query(value="select * from boards order by no desc limit :start, 10", nativeQuery = true)
	public List<Board> findAll(int start);		// 전체 목록 검색	
	
	public Board findByNo(int no);				// 상세 정보
	
//	public void delete(Board board);			// 글삭제 (생략)
	
}
