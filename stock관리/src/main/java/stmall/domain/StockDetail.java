package stmall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import stmall.Stock관리Application;
import stmall.domain.StockDecreased;
import stmall.domain.StockIncreased;

@Entity
@Table(name = "StockDetail_table")
@Data
//<<< DDD / Aggregate Root
public class StockDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String stock;

    public static StockDetailRepository repository() {
        StockDetailRepository stockDetailRepository = Stock관리Application.applicationContext.getBean(
            StockDetailRepository.class
        );
        return stockDetailRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseStart(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        StockDetail stockDetail = new StockDetail();
        repository().save(stockDetail);

        StockDecreased stockDecreased = new StockDecreased(stockDetail);
        stockDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(deliveryCompleted.get???()).ifPresent(stockDetail->{
            
            stockDetail // do something
            repository().save(stockDetail);

            StockDecreased stockDecreased = new StockDecreased(stockDetail);
            stockDecreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void decreaseStart(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        StockDetail stockDetail = new StockDetail();
        repository().save(stockDetail);

        StockDecreased stockDecreased = new StockDecreased(stockDetail);
        stockDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(orderPlaced.get???()).ifPresent(stockDetail->{
            
            stockDetail // do something
            repository().save(stockDetail);

            StockDecreased stockDecreased = new StockDecreased(stockDetail);
            stockDecreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseStart(ShippingReturned shippingReturned) {
        //implement business logic here:

        /** Example 1:  new item 
        StockDetail stockDetail = new StockDetail();
        repository().save(stockDetail);

        StockIncreased stockIncreased = new StockIncreased(stockDetail);
        stockIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(shippingReturned.get???()).ifPresent(stockDetail->{
            
            stockDetail // do something
            repository().save(stockDetail);

            StockIncreased stockIncreased = new StockIncreased(stockDetail);
            stockIncreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
