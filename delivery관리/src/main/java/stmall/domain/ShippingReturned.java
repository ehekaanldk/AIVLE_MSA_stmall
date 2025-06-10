package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ShippingReturned extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String customerid;
    private String itemid;
    private Integer qty;
    private String address;

    public ShippingReturned(DeliveryDetail aggregate) {
        super(aggregate);
    }

    public ShippingReturned() {
        super();
    }
}
//>>> DDD / Domain Event
