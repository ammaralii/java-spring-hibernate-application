package hrms.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="documents", schema = "hrms1")
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "document_id", updatable = false, nullable = false)
    private Integer documentId;

    @Basic
    @Column(name="cnic_file_name")
    private String cnicFileName;

    @Basic
    @Column(name="cnic_file_type")
    private String cnicFileType;

    @Lob
    @Column(name="cnic_file_data")
    private byte[] cnicFileData;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Documents(String cnicFileName, String cnicFileType, byte[] cnicFileData, Employee employee) {
        this.cnicFileName = cnicFileName;
        this.cnicFileType = cnicFileType;
        this.cnicFileData = cnicFileData;
        this.employee = employee;
    }

    public Documents() {
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer id) {
        this.documentId = id;
    }

    public String getCnicFileType() {
        return cnicFileType;
    }

    public void setCnicFileType(String cnicFileType) {
        this.cnicFileType = cnicFileType;
    }

    public String getCnicFileName() {
        return cnicFileName;
    }

    public void setCnicFileName(String cnicFileName) {
        this.cnicFileName = cnicFileName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public byte[] getCnicFileData() {
        return cnicFileData;
    }

    public void setCnicFileData(byte[] cnicFileData) {
        this.cnicFileData = cnicFileData;
    }
}
