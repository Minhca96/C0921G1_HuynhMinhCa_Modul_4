package vn.codegym.case_study_model_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_study_model_4.model.Employee;
import vn.codegym.case_study_model_4.service.IDivisionService;
import vn.codegym.case_study_model_4.service.IEducationDegreeService;
import vn.codegym.case_study_model_4.service.IEmployeeService;
import vn.codegym.case_study_model_4.service.IPositionService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private IPositionService iPositionService;
    @Autowired
    private IEducationDegreeService iEducationDegreeService;
    @Autowired
    private IDivisionService iDivisionService;

@GetMapping(" ")
    public String getHome(){
    return "home";
}
@GetMapping("employeeList")
    public String getEmployee(Model model, @PageableDefault(value = 2) Pageable pageable,
                              @RequestParam( defaultValue = "") String key_search,
                              @RequestParam(defaultValue = "") String positionId,
                              @RequestParam( defaultValue = "") String educationDegreeId,
                              @RequestParam( defaultValue = "") String divisionId){
    model.addAttribute("employeeList",iEmployeeService.searchEmployee(key_search,divisionId,positionId,educationDegreeId,pageable));
    model.addAttribute("positionList",iPositionService.getAll());
    model.addAttribute("educationDegreeList",iEducationDegreeService.getAll());
    model.addAttribute("divisionList",iDivisionService.getAll());
return "employee";
}
@GetMapping("addShowEmployee")
    public String addShow(Model model){
    model.addAttribute("employee",new Employee());
    model.addAttribute("positionList",iPositionService.getAll());
    model.addAttribute("educationDegreeList",iEducationDegreeService.getAll());
    model.addAttribute("divisionList",iDivisionService.getAll());
    return "addEmployee";

}
@PostMapping("addEmployee")
    public String Add(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes){
    iEmployeeService.add(employee);
    redirectAttributes.addFlashAttribute("message", "add employee complete");
    return "redirect:/employee/employeeList";

}


}
