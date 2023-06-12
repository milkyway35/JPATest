package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="boards")
//@SequenceGenerator(name="boards_seq_gen", 			//시퀀스 제너레이터 이름
//					 sequenceName="boards_seq", 		//시퀀스 이름
//					 initialValue=1, 					//시작값
//					 allocationSize=1 					//메모리를 통해 할당할 범위 사이즈
//					)
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)     //JPA 구현체(Hibernate)가 생성 방식을 결정(default)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)	//MySQL의 AUTO_INCREMENT 방식을 이용
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, //사용할 전략을 시퀀스로  선택
//    				generator="boards_seq_gen" 			//식별자 생성기를 설정해놓은  boards_seq_gen으로 설정 
//	)
	private int no;
	
	private String writer;
	private String passwd;
	private String subject;
	private String content;	
	
	@CreationTimestamp
	private Timestamp regdate;	
	
}
