package com.hihi.core.xml;

import com.hihi.core.member.MemberService;
import com.hihi.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlAppContext {


    @Test
    void xmlAppContext(){
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        // 이름 , 클래스로 등록 후 내부에 주입받을 다른 Bean 객체도 선언
        // https://spring.io/projects/spring-frameswork
        Assertions.assertThat(ac.getBean("memberService")).isInstanceOf(MemberServiceImpl.class);
    }

}
