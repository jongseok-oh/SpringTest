package com.hihi.core.singleton;

import com.hihi.core.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest {

    @Test
    void configurationDeep() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);

        System.out.println("bean = " + bean);

        // @Configuration으로 등록 된 Config Class는 Class 그대로 Bean에 등록 되는게 아니라
        // CGLIB library를 통해 AppConfig를 상속받은 다른 Class를 Bean에 등록한다.
        // Configuration@CGLIB(AppConfig 상속 받은 거) Class 내부에 Bean으로 등록 된 친구들을 살펴 보고
        // 이미 등록이 된 Bean이면 해당 객체를 return하고 아니면 새로 등록 -> 이런 방식으로 Singleton을 유지 함
    }
}

