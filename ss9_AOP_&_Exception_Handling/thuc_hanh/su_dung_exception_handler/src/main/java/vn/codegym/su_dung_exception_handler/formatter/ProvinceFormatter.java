package vn.codegym.su_dung_exception_handler.formatter;


import org.springframework.format.Formatter;
import vn.codegym.su_dung_exception_handler.model.Province;
import vn.codegym.su_dung_exception_handler.service.ProvinceService;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;


public class ProvinceFormatter implements Formatter<Province> {
    private final ProvinceService provinceService;

    public ProvinceFormatter(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        Optional<Province> provinceOptional = provinceService.findOne(Long.valueOf(text));
        return provinceOptional.orElse(null);
    }

    @Override
    public String print(Province object, Locale locale) {
        return object.toString();
    }
}
