package hrms.controller;

import hrms.domain.Company;
import hrms.domain.Department;
import hrms.domain.Employee;
import hrms.dto.EmployeeDTO;
import hrms.service.EmployeeService;
import org.hibernate.validator.internal.util.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/employee") // This means URL's start with /employee (after Application path)
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path="/add") // Map ONLY Post Requests
    public @ResponseBody String addNewEmployee (@RequestBody EmployeeDTO empDto) {
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
    public @ResponseBody Iterable<Employee> getAllEmployee() {
        // This returns a JSON or XML with the users
        return employeeService.getAll();
    }
    @GetMapping(path = "/find")
    public @ResponseBody
    Optional<Employee> getEmployeeByID(@RequestParam Integer id)
    {
        return employeeService.get(id);
    }
    @GetMapping(path = "/delete")
    public @ResponseBody
    String removeEmployeeByID(@RequestParam Integer id)
    {
        employeeService.remove(id);
        return "Deleted Successfully";
    }
    // Update an Employee
    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable(value = "id") Integer id,
                           @Valid @RequestBody EmployeeDTO empDto) {
        employeeService.update(id,empDto);
        return "Employee Updated Successfully";
    }
}