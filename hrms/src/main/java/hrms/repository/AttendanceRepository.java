package hrms.repository;

import hrms.domain.Attendance;
import org.springframework.data.repository.CrudRepository;

public interface AttendanceRepository extends CrudRepository<Attendance,Long> {
}
