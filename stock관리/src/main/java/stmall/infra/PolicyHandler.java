package stmall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stmall.config.kafka.KafkaProcessor;
import stmall.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    StockDetailRepository stockDetailRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryCompleted'"
    )
    public void wheneverDeliveryCompleted_DecreaseStart(
        @Payload DeliveryCompleted deliveryCompleted
    ) {
        DeliveryCompleted event = deliveryCompleted;
        System.out.println(
            "\n\n##### listener DecreaseStart : " + deliveryCompleted + "\n\n"
        );

        // Comments //
        //whenever 를 넣어본다.

        // Sample Logic //
        StockDetail.decreaseStart(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_DecreaseStart(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener DecreaseStart : " + orderPlaced + "\n\n"
        );

        // Comments //
        //whenever 를 넣어본다.

        // Sample Logic //
        StockDetail.decreaseStart(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ShippingReturned'"
    )
    public void wheneverShippingReturned_IncreaseStart(
        @Payload ShippingReturned shippingReturned
    ) {
        ShippingReturned event = shippingReturned;
        System.out.println(
            "\n\n##### listener IncreaseStart : " + shippingReturned + "\n\n"
        );

        // Comments //
        //whenever 를 넣어본다.

        // Sample Logic //
        StockDetail.increaseStart(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
