package hrms.service;

import hrms.domain.Company;
import hrms.domain.Department;
import hrms.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import hrms.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    // This means to get the bean called employeeRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    @Autowired
    private EmployeeRepository employeeRepository;

    public void add(String name, String email, String phone, String username, String password, String basicpay, String role, Company company, Department department) {
        Employee employee = new Employee();
        employee.setEmployeeName(name);
        employee.setEmployeeEmail(email);
        employee.setEmployeePhone(phone);
        employee.setEmployeeUsername(username);
        employee.setEmployeePassword(password);
        employee.setEmployeeBasicPay(basicpay);
        employee.setEmployeeRole(role);
        employee.setCompany(company);
        employee.setDepartment(department);
        employeeRepository.save(employee);
    }

    public Iterable<Employee> getAll() {
        return employeeRepository.findAll();
    }
    public Optional<Employee> get(Integer id)
    {
        return employeeRepository.findById(id);
    }
}