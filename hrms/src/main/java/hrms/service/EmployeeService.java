package hrms.service;

import hrms.domain.Company;
import hrms.domain.Department;
import hrms.domain.Employee;

import java.util.Optional;


public interface EmployeeService {
    // This means to get the bean called employeeRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    void add(String name, String email, String phone, String username, String password, String basicpay, String role, Company company, Department department);
    Iterable<Employee> getAll();
    Optional<Employee> get(Integer id);
}