package domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="attendence",schema = "hrms")
public class Attendence {
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

    public int getAttendenceId() {
        return attendenceId;
    }

    public void setAttendenceId(int attendenceId) {
        this.attendenceId = attendenceId;
    }

    public Timestamp getAttendenceDate() {
        return attendenceDate;
    }

    public void setAttendenceDate(Timestamp attendenceDate) {
        this.attendenceDate = attendenceDate;
    }

    public byte getAttendenceMarked() {
        return attendenceMarked;
    }

    public void setAttendenceMarked(byte attendenceMarked) {
        this.attendenceMarked = attendenceMarked;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
