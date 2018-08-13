package hrms.repository;

import hrms.domain.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
    @Query("SELECT e FROM Employee e order by e.employeeId desc")
    public List<Employee> findLastId();
}
