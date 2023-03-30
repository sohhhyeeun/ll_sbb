package com.ll.ll_sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Annotation 추가
@Controller
public class MainController {
    //url 매핑
    //HTTP protocol 통신 규약(통신하기 위한 약속)
    //HTTP Method : 요청을 보내는 방식(get, post, delete, put, patch ...)
    //요청(Request) : 클라이언트 -> 서버
    //응답(Response) : 서버 -> 클라이언트
    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
       return "index";
    }

    //ORM : RDBS SQL query를 자바 객체에서 실행할 수 있도록 도와줌.
    //Spring Data JPA(JPA를 연결한 ORM 구현체: hibernate, mybatis ...)
}
