package com.finedu.springboot.repository;

import com.finedu.springboot.model.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// Bean으로 설정
@Repository
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {


    Optional<Member> findBySeqAndName(Long key, String name);        // key, id

    @Query("SELECT m.org, count (m.seq) FROM Member m WHERE m.active = ?1 GROUP BY m.org")
    List<Object> countOrgGroup(Boolean isActive);

}
