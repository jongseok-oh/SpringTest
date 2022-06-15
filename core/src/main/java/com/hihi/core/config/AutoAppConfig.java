package com.hihi.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// AppConfig랑 Test code Configuration들도 다 등록해버려서
// Configuration annotation 친구들은 Scan에서 제외
// package가 다르면 Scan이 안됨.
// basePackages로 Scan 범위를 지정해 주자
@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION, classes= Configuration.class),
        basePackages = "com.hihi.core"
)
public class AutoAppConfig {

}
