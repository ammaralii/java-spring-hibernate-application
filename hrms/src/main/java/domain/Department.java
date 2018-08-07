package domain;

import javax.persistence.*;

@Entity
@Table(name="department",schema = "hrms")
public class Department {
    @Id
    @Column(name="departmentID")
    private int departmentId;

    @Basic
    @Column(name="departmentName")
    private String departmentName;

    @ManyToOne
    @JoinColumn(name="CompanyID")
    private Company company;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
