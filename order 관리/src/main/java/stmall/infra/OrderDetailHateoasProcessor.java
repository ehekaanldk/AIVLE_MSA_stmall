package stmall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import stmall.domain.*;

@Component
public class OrderDetailHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<OrderDetail>> {

    @Override
    public EntityModel<OrderDetail> process(EntityModel<OrderDetail> model) {
        return model;
    }
}
