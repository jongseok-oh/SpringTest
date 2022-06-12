package com.hihi.core.config;

import com.hihi.core.discount.DiscountPolicy;
import com.hihi.core.discount.FixDiscountPolicy;
import com.hihi.core.member.MemberRepository;
import com.hihi.core.member.MemberService;
import com.hihi.core.member.MemberServiceImpl;
import com.hihi.core.member.MemoryMemberRepository;
import com.hihi.core.order.OrderService;
import com.hihi.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }
}
