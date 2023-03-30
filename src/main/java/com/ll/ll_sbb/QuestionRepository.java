package com.ll.ll_sbb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> { //Question의 PK 타입은 Integer
}
