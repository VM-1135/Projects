package comems.ems.controller;

import comems.ems.entity.Employee;
import comems.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.StringJoiner;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/emp")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/emp")
    public List<Employee> fetchEmployeeList(){
        return employeeService.fetchEmployeeList();
    }

    @GetMapping("/emp/{id}")
    public Employee fetchEmployeeById(@PathVariable ("id")Long employeeId) {
        return employeeService.fetchEmployeeById(employeeId);
    }

    @DeleteMapping("/emp/{id}")
    public ResponseEntity<String>  deleteEmployeeById(@PathVariable ("id") Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
        return ResponseEntity.ok("Deleted Employee Successfully!!");
    }

    public Employee updateEmployeeById(@PathVariable ("id") Long employeeId, @RequestBody Employee employee) {
        return employeeService.updateEmployeebyId(employeeId, employee);

    }
}
