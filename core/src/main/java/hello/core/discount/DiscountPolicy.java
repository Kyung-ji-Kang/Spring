package hello.core.discount;

import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public interface DiscountPolicy {

    /*
        @return 할인 대상 금액
    */

    int discount(Member member, int price);

}
