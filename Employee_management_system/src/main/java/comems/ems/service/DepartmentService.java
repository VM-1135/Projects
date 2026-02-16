package comems.ems.service;

import comems.ems.entity.Department;

import java.util.List;

public interface DepartmentService {




    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);

   public List<Department> saveDepartments(List<Department> departments);

   public void deleteDepartmentById(Long departmentId);


   public Department updateDepartment(Long departmentId, Department department);
}
