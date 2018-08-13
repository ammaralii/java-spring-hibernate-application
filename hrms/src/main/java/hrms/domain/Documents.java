package hrms.domain;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="documents", schema = "hrms1")
public @Data class Documents {
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

    public Documents(String fileName, String contentType, byte[] bytes, Employee employee) {
        this.cnicFileName=fileName;
        this.cnicFileType=contentType;
        this.cnicFileData=bytes;
        this.employee=employee;
    }
}