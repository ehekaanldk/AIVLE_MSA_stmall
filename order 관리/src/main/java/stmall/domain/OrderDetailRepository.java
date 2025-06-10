package stmall.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmall.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "orderDetails",
    path = "orderDetails"
)
public interface OrderDetailRepository
    extends PagingAndSortingRepository<OrderDetail, Long> {}
