package hrms.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="department",schema = "hrms1")
public @Data class Department {
    @Id
    @Column(name="department_id")
    private int departmentId;

    @Basic
    @Column(name="department_name")
    private String departmentName;

    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;
}