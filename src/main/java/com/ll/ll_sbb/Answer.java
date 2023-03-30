package com.ll.ll_sbb;

import jakarta.persistence.*;

import java.time.LocalDateTime;

//연관관계
//Answer Question
//일대일
//다대일 @ManyToOne
//일대다 @OneToMany
//다대다

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
}
