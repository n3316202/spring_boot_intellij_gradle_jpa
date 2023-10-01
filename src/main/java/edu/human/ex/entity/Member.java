package edu.human.ex.entity;

import lombok.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString  //외래키는 ToString에서 제외 - 주의 서로가 toString 끼리 서로 호출 됨
public class Member extends BaseEntity {

	@Id
	private String email;

	private String password;

	private String name;

}
