package hrms.repository;

import hrms.domain.Documents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DocumentsRepository extends JpaRepository<Documents,Integer> {
}
