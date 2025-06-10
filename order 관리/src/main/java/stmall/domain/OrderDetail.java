package stmall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import stmall.Order관리Application;
import stmall.domain.OrderCancelled;
import stmall.domain.OrderPlaced;

@Entity
@Table(name = "OrderDetail_table")
@Data
//<<< DDD / Aggregate Root
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerid;

    private String itemid;

    private Integer qty;

    private String status;

    private String address;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();
    }

    public static OrderDetailRepository repository() {
        OrderDetailRepository orderDetailRepository = Order관리Application.applicationContext.getBean(
            OrderDetailRepository.class
        );
        return orderDetailRepository;
    }

    //<<< Clean Arch / Port Method
    public static void sendAlert(StockIncreased stockIncreased) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderDetail orderDetail = new OrderDetail();
        repository().save(orderDetail);

        */

        /** Example 2:  finding and process
        

        repository().findById(stockIncreased.get???()).ifPresent(orderDetail->{
            
            orderDetail // do something
            repository().save(orderDetail);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(ShippingReturned shippingReturned) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderDetail orderDetail = new OrderDetail();
        repository().save(orderDetail);

        */

        /** Example 2:  finding and process
        

        repository().findById(shippingReturned.get???()).ifPresent(orderDetail->{
            
            orderDetail // do something
            repository().save(orderDetail);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderDetail orderDetail = new OrderDetail();
        repository().save(orderDetail);

        */

        /** Example 2:  finding and process
        

        repository().findById(deliveryCompleted.get???()).ifPresent(orderDetail->{
            
            orderDetail // do something
            repository().save(orderDetail);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
