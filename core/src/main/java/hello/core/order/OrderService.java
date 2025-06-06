package hello.core.order;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
