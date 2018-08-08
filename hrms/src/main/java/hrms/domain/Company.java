package hrms.domain;

import javax.persistence.*;

@Entity
@Table(name="company",schema = "hrms")
public class Company {
    @Id
    @Column(name="CompanyID")
    private Integer companyId;

    @Basic
    @Column(name="CompanyName")
    private String companyName;

    @Basic
    @Column(name="Address")
    private String address;

    @Basic
    @Column(name="CompanyCEO")
    private String companyCeo;

    @Basic
    @Column(name="CompanyEmail")
    private String companyEmail;

    @Basic
    @Column(name = "CaompanyPhone")
    private String companyPhone;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyCeo() {
        return companyCeo;
    }

    public void setCompanyCeo(String companyCeo) {
        this.companyCeo = companyCeo;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCaompanyPhone() {
        return companyPhone;
    }

    public void setCaompanyPhone(String caompanyPhone) {
        this.companyPhone = caompanyPhone;
    }
}
