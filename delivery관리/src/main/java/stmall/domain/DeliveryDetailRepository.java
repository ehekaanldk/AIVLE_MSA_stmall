package stmall.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmall.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "deliveryDetails",
    path = "deliveryDetails"
)
public interface DeliveryDetailRepository
    extends PagingAndSortingRepository<DeliveryDetail, Long> {}
