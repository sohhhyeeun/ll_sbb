package com.ll.ll_sbb;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity //데이터베이스와 테이블 연동
public class Question {
    //Entity -> PK column 필요
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200) //varChar가 255를 기본으로 올라가는데 200으로 제한하기 위해
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) //question 필드를 통해 참조, (영속성 전이) question에 부여한 영속성 변경 -> q 지워질 때 연관된 a도 삭제
    List<Answer> answerList; //Question에서도 Answer 클래스 참조 가능해짐.
}
