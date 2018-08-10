package hrms.service;

import hrms.domain.Company;
import hrms.domain.Department;
import hrms.domain.Documents;
import hrms.domain.Employee;
import hrms.dto.EmployeeDTO;
import hrms.exception.FileStorageException;
import hrms.exception.MyFileNotFoundException;
import hrms.repository.CompanyRepository;
import hrms.repository.DepartmentRepository;
import hrms.repository.DocumentsRepository;
import hrms.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class DocumentsServiceImpl implements DocumentsService{
    @Autowired
    private DocumentsRepository documentsRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public Documents storeFile(Integer employeeId,MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }
            Employee employee=employeeRepository.findById(employeeId).get();
            Documents dbFile = new Documents(fileName, file.getContentType(), file.getBytes(),employee);

            return documentsRepository.save(dbFile);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public Documents getFile(Integer fileId) {
        return documentsRepository.findById(fileId)
                .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }
}
