package comems.ems.entity;

public class Employee {
    private Long employeeId;
    private String employeeName;
    private String employeeAdd;
    private String employeeCode;

    private Long getEmployeeId(){
        return employeeId;
    }

    private String getEmployeeName(){
        return employeeName;
    }

    public Employee(Long employeeId, String employeeName, String employeeAdd, String employeeCode) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAdd = employeeAdd;
        this.employeeCode = employeeCode;
    }

    private String getEmployeeAdd(){
        return employeeAdd;
    }
    private String getEmployeeCode(){
        return employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAdd='" + employeeAdd + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeAdd(String employeeAdd) {
        this.employeeAdd = employeeAdd;
    }

    public Employee() {
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
}
