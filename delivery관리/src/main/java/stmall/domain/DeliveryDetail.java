package stmall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import stmall.Delivery관리Application;
import stmall.domain.DeliveryCompleted;
import stmall.domain.ShippingReturned;

@Entity
@Table(name = "DeliveryDetail_table")
@Data
//<<< DDD / Aggregate Root
public class DeliveryDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderid;

    private String customerid;

    private String itemid;

    private Integer qty;

    private String address;

    private String status;

    public static DeliveryDetailRepository repository() {
        DeliveryDetailRepository deliveryDetailRepository = Delivery관리Application.applicationContext.getBean(
            DeliveryDetailRepository.class
        );
        return deliveryDetailRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startDelivery(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        DeliveryDetail deliveryDetail = new DeliveryDetail();
        repository().save(deliveryDetail);

        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(deliveryDetail);
        deliveryCompleted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(orderPlaced.get???()).ifPresent(deliveryDetail->{
            
            deliveryDetail // do something
            repository().save(deliveryDetail);

            DeliveryCompleted deliveryCompleted = new DeliveryCompleted(deliveryDetail);
            deliveryCompleted.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void cancelDelivery(OrderCancelled orderCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        DeliveryDetail deliveryDetail = new DeliveryDetail();
        repository().save(deliveryDetail);

        ShippingReturned shippingReturned = new ShippingReturned(deliveryDetail);
        shippingReturned.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(orderCancelled.get???()).ifPresent(deliveryDetail->{
            
            deliveryDetail // do something
            repository().save(deliveryDetail);

            ShippingReturned shippingReturned = new ShippingReturned(deliveryDetail);
            shippingReturned.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
