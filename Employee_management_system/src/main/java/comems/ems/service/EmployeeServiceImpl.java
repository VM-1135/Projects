package comems.ems.service;

import comems.ems.entity.Department;
import comems.ems.entity.Employee;
import comems.ems.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

    @Service
    public class EmployeeServiceImpl implements EmployeeService {

         @Autowired
        private EmployeeRepository employeeRepository;

        @Override
        public Employee saveEmployee(Employee employee) {
            return employeeRepository.save(employee) ;
        }

        @Override
        public List<Employee> fetchEmployeeList() {
            return employeeRepository.findAll() ;
        }

        @Override
        public Employee fetchEmployeeById(Long employeeId) {
            return employeeRepository.findById(employeeId).get();
        }

        @Override
        public void deleteEmployeeById(Long employeeId) {
            if(!employeeRepository.existsById(employeeId)) {
                System.out.println("Employee does not exist");
            }
            employeeRepository.deleteById(employeeId);
        }

        @Override
        public Employee updateEmployeebyId(Long employeeId, Employee employee) {
            Employee empDB = employeeRepository.findById(employeeId).get();

            if(Objects.nonNull(employee.getEmployeeName()) &&
                    !"".equalsIgnoreCase(employee.getEmployeeName())) {
                empDB.setEmployeeName(employee.getEmployeeName());
            }

            if(Objects.nonNull(department.getDepartmentCode()) &&
                    !"".equalsIgnoreCase(department.getDepartmentCode())) {
                depDB.setDepartmentCode(department.getDepartmentCode());
            }

            if(Objects.nonNull(department.getDepartmentAddress()) &&
                    !"".equalsIgnoreCase(department.getDepartmentAddress())) {
                depDB.setDepartmentAddress(department.getDepartmentAddress());
            }
            return departmentRepository.save(depDB);
        }


    }

