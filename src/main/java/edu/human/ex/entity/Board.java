package edu.human.ex.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@Getter
@ToString(exclude = "writer")   //외래키는 ToString에서 제외
@NoArgsConstructor
public class Board extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bno;

	private String title;

	private String content;

	//외래키를 참조함을 명시
	@ManyToOne
	private Member writer;
}
