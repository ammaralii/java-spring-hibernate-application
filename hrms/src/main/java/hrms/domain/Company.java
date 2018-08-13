package hrms.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="company",schema = "hrms1")
public @Data class Company {
    @Id
    @Column(name="company_id")
    private Integer companyId;

    @Basic
    @Column(name="company_name")
    private String companyName;

    @Basic
    @Column(name="Address")
    private String address;

    @Basic
    @Column(name="company_ceo")
    private String companyCeo;

    @Basic
    @Column(name="company_email")
    private String companyEmail;

    @Basic
    @Column(name = "company_phone")
    private String companyPhone;
}