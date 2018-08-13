package hrms.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="employee", schema = "hrms1")
public @Data class Employee{
    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Basic
    @Column(name = "employee_email")
    private String employeeEmail;

    @Basic
    @Column(name = "employee_phone")
    private String employeePhone;

    @Basic
    @Column(name = "employee_username")
    private String employeeUsername;

    @Basic
    @Column(name = "employee_password")
    private String employeePassword;

    @Basic
    @Column(name = "employee_basic_pay")
    private String employeeBasicPay;

    @Basic
    @Column(name = "employee_role")
    private String employeeRole;

    @ManyToOne
    @JoinColumn(name = "department_id",referencedColumnName = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "company_id",referencedColumnName = "company_id")
    private Company company;
}