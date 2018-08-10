package hrms.domain;

import javax.persistence.*;

@Entity
@Table(name="department",schema = "hrms1")
public class Department {
    @Id
    @Column(name="department_id")
    private int departmentId;

    @Basic
    @Column(name="department_name")
    private String departmentName;

    @ManyToOne
    @JoinColumn(name="company_id")
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
