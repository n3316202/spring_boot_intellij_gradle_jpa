package edu.human.ex.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@Getter
@ToString(exclude = "board")
@NoArgsConstructor
public class Reply extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rno;

	private String text;

	private String replier;

	@ManyToOne
	private Board board;
}
