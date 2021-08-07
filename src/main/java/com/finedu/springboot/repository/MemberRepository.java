package com.finedu.springboot.repository;

import com.finedu.springboot.model.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
// Bean으로 설정
@Repository
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}
