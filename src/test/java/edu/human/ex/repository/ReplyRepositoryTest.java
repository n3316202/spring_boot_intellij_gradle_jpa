package edu.human.ex.repository;

import edu.human.ex.entity.Board;
import edu.human.ex.entity.Reply;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReplyRepositoryTest {
    @Autowired
    private ReplyRepository replyRepository;

    @Test
    @Disabled
    public void insertReply() {
        IntStream.rangeClosed(1, 300).forEach(i -> {
            long bno = (long)(Math.random()*100) + 1;

            Board board = Board.builder().bno(bno).build();

            System.out.println("아아아" + board);

            Reply reply = Reply.builder()
                    .text("Reply........" + i)
                    .board(board)
                    .replier("guest")
                    .build();

            replyRepository.save(reply);
        });
    }

    @Test
    public void readReply1() {
        Optional<Reply> result = replyRepository.findById(1L);

        Reply reply = result.get();

        System.out.println(reply);
        System.out.println(reply.getBoard());
    }
}