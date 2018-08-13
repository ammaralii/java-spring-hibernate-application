package hrms.controller;

import hrms.domain.Company;
import hrms.domain.Department;
import hrms.domain.Employee;
import hrms.dto.EmployeeDTO;
import hrms.service.EmployeeService;
import org.hibernate.validator.internal.util.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController    // This means that this class is a Controller and do not use @ResponseBody in function because it is done automatically when we use annotation @RestController
@RequestMapping(path="/employee") // This means URL's start with /employee (after Application path)
@EnableAsync
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path="/add") // Map ONLY Post Requests
    public synchronized String addNewEmployee (@RequestBody EmployeeDTO empDto) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        if(!empDto.equals(null)) {
            employeeService.add(empDto);
        }
        else{
            return "Please pass all required parameter";
        }
        return "Saved";
    }
    @GetMapping(path="/all")
    public synchronized Page<Employee> getAllEmployee(Pageable pageable) {
        // This returns a JSON or XML with the users
        return employeeService.getAll(pageable);
    }
    @GetMapping(path = "/find")
    public synchronized Optional<Employee> getEmployeeByID(@RequestParam Integer id)
    {
        return employeeService.get(id);
    }
    @GetMapping(path = "/delete")
    public synchronized String removeEmployeeByID(@RequestParam Integer id)
    {
        synchronized (this) {
            employeeService.remove(id);
        }
        return "Deleted Successfully";
    }
    // Update an Employee
    @PutMapping("/update/{id}")
    public synchronized String updateEmployee(@PathVariable(value = "id") Integer id,
                           @Valid @RequestBody EmployeeDTO empDto) {
        synchronized (this) {
            employeeService.update(id, empDto);
        }
        return "Employee Updated Successfully";
    }
}