package hrms.service;

import hrms.domain.Company;
import hrms.domain.Department;
import hrms.domain.Employee;
import hrms.dto.EmployeeDTO;

import java.util.Optional;


public interface EmployeeService {
    // This means to get the bean called employeeRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    void add(EmployeeDTO emp);
    Iterable<Employee> getAll();
    Optional<Employee> get(Integer id);
    void remove(Integer id);
    void update(Integer id,EmployeeDTO emp);
}
