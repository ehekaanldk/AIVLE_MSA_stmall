package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String customerid;
    private String itemid;
    private Integer qty;
    private String address;
}
