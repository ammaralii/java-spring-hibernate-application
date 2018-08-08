package hrms.repository;

import hrms.domain.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Integer> {
}
