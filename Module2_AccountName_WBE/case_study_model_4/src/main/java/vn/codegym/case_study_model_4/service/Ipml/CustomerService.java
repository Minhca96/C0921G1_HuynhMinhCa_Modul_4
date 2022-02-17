package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.repository.ICustomerRepository;
import vn.codegym.case_study_model_4.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;
}
