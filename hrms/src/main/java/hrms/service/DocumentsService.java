package hrms.service;

import hrms.domain.Documents;
import hrms.domain.Employee;
import hrms.dto.EmployeeDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;


public interface DocumentsService {
    public Documents storeFile(Integer employeeId,MultipartFile file);
    public Documents getFile(Integer fileId);
}
