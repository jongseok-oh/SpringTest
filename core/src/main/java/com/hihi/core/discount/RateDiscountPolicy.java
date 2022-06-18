package com.hihi.core.discount;

import com.hihi.core.annotation.MainDiscountPolicy;
import com.hihi.core.member.Grade;
import com.hihi.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("mainDiscountPolicy")
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{

    final Integer discountRatePercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountRatePercent / 100;
        }
        return 0;
    }
}
