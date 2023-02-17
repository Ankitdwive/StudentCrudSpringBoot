package com.example.StudentCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.StudentCrud.entityy.Employee;
import com.example.StudentCrud.entityy.Student;
import com.example.StudentCrud.service.StudentService;
import com.example.StudentCrud.service.StudentService2;

//import antlr.collections.List;

@Controller
public class StudentController {

@GetMapping("/")
String login() {
	return "login";
}
@GetMapping("url1")
public String print(@RequestParam String un,@RequestParam String ps,ModelMap mod) {
	if(un.equals("Ankit")&&ps.equals("1234")) {
		mod.put("un", un);
		return "home";
	}
	mod.put("errormsg"," Insert a valid name and password");
	return "error";
}
@Autowired
private StudentService service;


@GetMapping("/home")
	public String Home() {
	return "Home";
}
 
    @GetMapping("/index")
    public String viewHomePage(Model model) {
        List<Student> liststudent = service.listAll();
        model.addAttribute("liststudent", liststudent);
        System.out.print("Get / ");
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("student", new Student());
        System.out.println("Get /");
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student std) {
        service.saveStudent(std);
        return "insert2";
    }
 
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditsamplePage(@PathVariable(name = "id") long id) {
        ModelAndView mav = new ModelAndView("new");
        Student std = service.getsampleById(id);
        mav.addObject("student", std);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")
    public String deletesample(@PathVariable(name = "id") int id) {
        service.deletesample(id);
        return "redirect:/";
    }

    @Autowired
    private StudentService2 service1;


 
    @GetMapping("/index2")
    public String viewHomePage1(Model model) {
        List<Employee> liststudent = service1.listAll();
        model.addAttribute("liststudent", liststudent);
        System.out.print("Get / ");
        return "index2";
    }
    @GetMapping("/new2")
    public String add1(Model model) {
        model.addAttribute("Teacher", new Employee());
        System.out.println("Get /");
        return "new2";
    }
 
    @RequestMapping(value = "/save1", method = RequestMethod.POST)
    public String saveStudent1(@ModelAttribute("Teacher") Employee std) {
        service1.saveStudent(std);
        return "insert";
    }
 
    @RequestMapping("/edit1/{Eid}")
    public ModelAndView showEditsamplePage1(@PathVariable(name = "Eid") long Eid) {
        ModelAndView mav1 = new ModelAndView("new2");
        Employee std1 = service1.getsampleById(Eid);
        mav1.addObject("Teacher", std1);
        return mav1;
        
    }
    @RequestMapping("/delete1/{Eid}")
    public String deletesample1(@PathVariable(name = "Eid") int Eid) {
        service1.deletesample(Eid);
        return "redirect:/";
    }
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    

 
}