package hrms.domain;

import javax.persistence.*;

@Entity
@Table(name="documents", schema = "hrms")
public class Documents {
    @Id
    @Column(name = "DocumentID")
    private Integer documentId;

    @Basic
    @Column(name="CNIC_FileName")
    private String cnicFileName;

    @Basic
    @Column(name="CNIC_FilePath")
    private String cnicFilePath;

    @OneToOne
    @MapsId
    @JoinColumn(name = "EmployeeID")
    private Employee employee;

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getCnicFileName() {
        return cnicFileName;
    }

    public void setCnicFileName(String cnicFileName) {
        this.cnicFileName = cnicFileName;
    }

    public String getCnicFilePath() {
        return cnicFilePath;
    }

    public void setCnicFilePath(String cnicFilePath) {
        this.cnicFilePath = cnicFilePath;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
