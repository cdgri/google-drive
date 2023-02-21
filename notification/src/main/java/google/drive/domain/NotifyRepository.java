package google.drive.domain;

import google.drive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "notifies", path = "notifies")
public interface NotifyRepository
    extends PagingAndSortingRepository<Notify, Long> {}
