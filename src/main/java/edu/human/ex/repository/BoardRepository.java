package edu.human.ex.repository;

import edu.human.ex.entity.Board;
import edu.human.ex.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<Board, Long> {
}