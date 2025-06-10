package stmall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import stmall.domain.*;

@Component
public class DeliveryDetailHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DeliveryDetail>> {

    @Override
    public EntityModel<DeliveryDetail> process(
        EntityModel<DeliveryDetail> model
    ) {
        return model;
    }
}
