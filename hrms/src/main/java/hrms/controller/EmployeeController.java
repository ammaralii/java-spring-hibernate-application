package hrms.controller;

import hrms.domain.Company;
import hrms.domain.Department;
import hrms.domain.Employee;
import hrms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/employee") // This means URL's start with /employee (after Application path)
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewEmployee (@RequestParam String name
            , @RequestParam String email, @RequestParam String phone, @RequestParam String username, @RequestParam String password, @RequestParam String basicpay, @RequestParam String role, @RequestParam Company company, @RequestParam Department department) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        employeeService.add(name,email,phone,username,password,basicpay,role,company,department);
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
}