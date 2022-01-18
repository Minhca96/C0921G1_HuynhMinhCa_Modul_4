package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Province;
import vn.codegym.repository.IProvinceRepository;

import java.util.Optional;
@Service
public class ProviceService implements IProviceService{

    @Autowired
    private IProvinceRepository provinceRepository;
    @Override
    public Iterable<Province> findAll() {

        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {

        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }

}
