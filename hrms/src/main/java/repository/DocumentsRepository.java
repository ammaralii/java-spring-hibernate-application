package repository;

import domain.Documents;
import org.springframework.data.repository.CrudRepository;

public interface DocumentsRepository extends CrudRepository<Documents,Long> {
}
