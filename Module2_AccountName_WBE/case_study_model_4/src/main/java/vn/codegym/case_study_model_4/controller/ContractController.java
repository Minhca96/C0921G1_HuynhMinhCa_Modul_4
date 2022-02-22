package vn.codegym.case_study_model_4.controller;

import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_study_model_4.model.Contract;
import vn.codegym.case_study_model_4.service.IContractService;
import vn.codegym.case_study_model_4.service.ICustomerService;
import vn.codegym.case_study_model_4.service.IEmployeeService;
import vn.codegym.case_study_model_4.service.IServiceService;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService iContractService;
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private IServiceService iServiceService;
    @GetMapping("")
    public String getHome(){
        return "home";
    }
    @GetMapping("/contractList")
    public String getContract(Model model, @PageableDefault(value=2)Pageable pageable,
                              @RequestParam(defaultValue = "") String key_search,
                              @RequestParam(defaultValue = "") String employee,
                              @RequestParam(defaultValue = "") String customer,
                              @RequestParam(defaultValue = "") String service){
        model.addAttribute("contractList",iContractService.findAll(key_search,employee,customer,service,pageable));
        model.addAttribute("employeeList",iEmployeeService.getAll());
        model.addAttribute("customerList",iCustomerService.getAll());
        model.addAttribute("serviceList",iServiceService.getAll());
        return "contract";

    }
    @GetMapping("addShowContract")
    private String addShow(Model model){
        model.addAttribute("contract",new Contract()) ;
        model.addAttribute("employeeList",iEmployeeService.getAll());
        model.addAttribute("customerList",iCustomerService.getAll());
        model.addAttribute("serviceList",iServiceService.getAll());
        return "addContract";
    }
    @PostMapping("addContract")
    public String add(@ModelAttribute Contract contract, RedirectAttributes redirectAttributes){
        iContractService.add(contract);
        redirectAttributes.addFlashAttribute("massage", "add Contract complete ");
        return "redirect:/contract/contractList";
    }
}
