package vn.codegym.spring_security_nhap.service.Iplm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.spring_security_nhap.repository.IStudentRepository;
import vn.codegym.spring_security_nhap.service.IStudentService;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
}
