package stmall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import stmall.domain.*;

@Component
public class StockDetailHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<StockDetail>> {

    @Override
    public EntityModel<StockDetail> process(EntityModel<StockDetail> model) {
        return model;
    }
}
