package hrms.domain;

import javax.persistence.*;

@Entity
@Table(name="employee", schema = "hrms")
public class Employee {
    @Id
    @Column(name = "EmployeeID")
    private Integer employeeId;

    @Column(name = "EmployeeName")
    private String employeeName;

    @Basic
    @Column(name = "EmployeeEmail")
    private String employeeEmail;

    @Basic
    @Column(name = "EmployeePhone")
    private String employeePhone;

    @Basic
    @Column(name = "EmployeeUsername")
    private String employeeUsername;

    @Basic
    @Column(name = "EmployeePassword")
    private String employeePassword;

    @Basic
    @Column(name = "EmployeeBasicPay")
    private String employeeBasicPay;

    @Basic
    @Column(name = "EmployeeRole")
    private String employeeRole;

    @ManyToOne
    @JoinColumn(name = "DepartmentID",referencedColumnName = "departmentID")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "CompanyID")
    private Company company;

    public Employee(int employeeId, String employeeName, String employeeEmail, String employeePhone, String employeeUsername, String employeePassword, String employeeBasicPay, String employeeRole,Department d,Company c) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
        this.employeeUsername = employeeUsername;
        this.employeePassword = employeePassword;
        this.employeeBasicPay = employeeBasicPay;
        this.employeeRole = employeeRole;
        this.department=d;
        this.company=c;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public String getEmployeeBasicPay() {
        return employeeBasicPay;
    }

    public void setEmployeeBasicPay(String employeeBasicPay) {
        this.employeeBasicPay = employeeBasicPay;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeUsername='" + employeeUsername + '\'' +
                ", employeePassword='" + employeePassword + '\'' +
                ", employeeBasicPay='" + employeeBasicPay + '\'' +
                ", employeeRole='" + employeeRole + '\'' +
                ", department=" + department +
                ", company=" + company +
                '}';
    }
}
