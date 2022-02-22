package vn.codegym.case_study_model_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_study_model_4.model.ContractDetail;
import vn.codegym.case_study_model_4.service.IAttachServiceService;
import vn.codegym.case_study_model_4.service.IContractDetailService;
import vn.codegym.case_study_model_4.service.IContractService;

@Controller
@RequestMapping("contractDetail")
public class ContractDetailController {
    @Autowired
    private IContractDetailService iContractDetailService;
    @Autowired
    private IAttachServiceService iAttachServiceService;
    @Autowired
    private IContractService iContractService;
    @GetMapping("")
    public String getHome(){
        return "home";
    }
    @GetMapping("contractDetailList")
    public String getContractDetail(Model model, @PageableDefault(value = 2)Pageable pageable,
                                    @RequestParam(defaultValue = "") String key_search,
                                    @RequestParam(defaultValue = "") String contractId,
                                    @RequestParam(defaultValue = "")String attachServiceId){
        model.addAttribute("contractDetailList",iContractDetailService.findAll(key_search,contractId,attachServiceId,pageable));
        model.addAttribute("attachServiceList", iAttachServiceService.getAll());
        model.addAttribute("contractList",iContractService.getAll());
        return "contractDetail";
    }
    @GetMapping("addShowContractDetail")
    private String addShow(Model model){
        model.addAttribute("contractDetail",new ContractDetail());
        model.addAttribute("attachServiceList", iAttachServiceService.getAll());
        model.addAttribute("contractList",iContractService.getAll());
        return "addContractDetail";
    }
    @PostMapping("add")
    public String addContractDetail(@ModelAttribute ContractDetail contractDetail, RedirectAttributes redirectAttributes){
        iContractDetailService.add(contractDetail);
        redirectAttributes.addFlashAttribute("massage","add ContractDetail complete");
        return "redirect:/contractDetail/contractDetailList";
    }

}
