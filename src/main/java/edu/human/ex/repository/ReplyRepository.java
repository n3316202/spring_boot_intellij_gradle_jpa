package edu.human.ex.repository;

import edu.human.ex.entity.Member;
import edu.human.ex.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReplyRepository extends JpaRepository<Reply, Long> {
}