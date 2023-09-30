package edu.human.ex.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberTest {
    @Autowired
    EntityManager em;

    @Test
    @Transactional
    @Rollback(value = false)
    public void testSave() {
        Team team = new Team();
        team.setName("TeamA");
        em.persist(team);

        Member member = new Member();
        member.setName("member1");
        member.setTeam(team); //단방향 연관관계 설정, 참조 저장
        em.persist(member);

        Member findMember = em.find(Member.class, member.getId());
        Team findTeam = findMember.getTeam(); //참조를 사용해서 연관관계 조회
    }

}