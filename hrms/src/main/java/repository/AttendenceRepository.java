package repository;

import domain.Attendence;
import org.springframework.data.repository.CrudRepository;

public interface AttendenceRepository extends CrudRepository<Attendence,Long> {
}
