package vn.codegym.case_study_model_4.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_study_model_4.model.Service;

import java.util.List;


public interface IServiceService {

    Page<Service> findAll(String key_search, String rentTypeId, String serviceTypeId, Pageable pageable);

    void add(Service service);

    List<Service> getAll();
}
