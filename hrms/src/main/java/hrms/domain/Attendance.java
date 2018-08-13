package hrms.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="attendence",schema = "hrms1")
public @Data class Attendance {
    @Id
    @Column(name="AttendenceID")
    private int attendenceId;

    @Basic
    @Column(name="AttendenceDate")
    private Timestamp attendenceDate;

    @Basic
    @Column(name = "AttendenceMarked")
    private byte attendenceMarked;

    @OneToOne
    @MapsId
    @JoinColumn(name = "EmployeeID")
    private Employee employee;
}