package vn.codegym.case_study_model_4.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_study_model_4.dto.ServiceDTO;
import vn.codegym.case_study_model_4.model.Service;
import vn.codegym.case_study_model_4.service.IContractService;
import vn.codegym.case_study_model_4.service.IRentTypeService;
import vn.codegym.case_study_model_4.service.IServiceService;
import vn.codegym.case_study_model_4.service.IServiceTypeService;

@Controller
@RequestMapping("service")
public class ServiceController {
    @Autowired
    private IServiceService iServiceService;
    @Autowired
    private IServiceTypeService iServiceTypeService;
    @Autowired
    private IRentTypeService iRentTypeService;
    @Autowired
    private IContractService iContractService;
    @GetMapping(" ")
    public String getHome(){
        return "home";
    }

    @GetMapping("serviceList")
    public String getAllService(Model model,
                                @PageableDefault( value = 2) Pageable pageable,
                                @RequestParam(defaultValue = "") String key_search,
                                @RequestParam(defaultValue = "") String rentTypeId,
                                @RequestParam(defaultValue = "") String serviceTypeId){
        model.addAttribute("serviceList",iServiceService.findAll(key_search,rentTypeId,serviceTypeId,pageable));
        model.addAttribute("rentTypeList", iRentTypeService.findAll());
        model.addAttribute("serviceTypeList",iServiceTypeService.findAll() );
        return "service";

    }
    @GetMapping("addShowService")
    public String getShow(Model model){
        model.addAttribute("serviceDto" , new ServiceDTO());
        model.addAttribute("rentTypeList",iRentTypeService.findAll());
        model.addAttribute("serviceTypeList", iServiceTypeService.findAll());
        return "addService";
    }
    @PostMapping("addService")
    public String add(@Validated @ModelAttribute("serviceDto")  ServiceDTO serviceDto,
                      BindingResult bindingresult,
                      RedirectAttributes redirectAttributes,
                      Model model){
        if(bindingresult.hasFieldErrors()){
            model.addAttribute("rentTypeList",iRentTypeService.findAll());
            model.addAttribute("serviceTypeList", iServiceTypeService.findAll());
            return "addService";
        }else {
            Service service = new Service();
            BeanUtils.copyProperties(serviceDto,service);
            iServiceService.add(service);
            redirectAttributes.addFlashAttribute("message", "add service complete");
            return "redirect:/service/serviceList";
        }

    }
}
