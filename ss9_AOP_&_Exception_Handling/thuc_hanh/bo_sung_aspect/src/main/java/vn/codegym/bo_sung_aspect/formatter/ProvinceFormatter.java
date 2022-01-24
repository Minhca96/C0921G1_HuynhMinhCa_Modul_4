package vn.codegym.bo_sung_aspect.formatter;



import org.springframework.format.Formatter;
import vn.codegym.bo_sung_aspect.model.Province;
import vn.codegym.bo_sung_aspect.service.ProvinceService;

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
