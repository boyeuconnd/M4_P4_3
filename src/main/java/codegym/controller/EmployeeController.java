package codegym.controller;

import codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("employee/")
public class EmployeeController {

    @RequestMapping(value = "showform",method = RequestMethod.GET)
    public ModelAndView showform(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("getEmployee",new Employee());
        return modelAndView;
    }

    @RequestMapping(value = "addEmployee",method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee")Employee employee, ModelMap model){
        model.addAttribute("outputEmployee",employee);

        return "info";
    }
}
