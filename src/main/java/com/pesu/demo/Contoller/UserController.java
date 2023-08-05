package com.pesu.demo.Contoller;

import java.util.List;
import com.pesu.demo.service.studentreg3Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
//
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//
import org.springframework.web.bind.annotation.RequestParam;
//
import com.pesu.demo.model.User;
import com.pesu.demo.model.postallot;
import com.pesu.demo.model.query;
import com.pesu.demo.model.student;
import com.pesu.demo.model.studentreg2;
import com.pesu.demo.model.studentreg3;
import com.pesu.demo.repository.StudentRepository;
import com.pesu.demo.repository.UserRepository;
import com.pesu.demo.repository.postallotRepository;
import com.pesu.demo.repository.queryRepository;
import com.pesu.demo.repository.studentreg2Repository;
import com.pesu.demo.repository.studentreg3Repository;
import com.pesu.demo.service.UserService;
import com.pesu.demo.service.postallotService;
import com.pesu.demo.service.studentreg2Service;
import com.pesu.demo.service.studentreg3Service;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import com.pesu.demo.service.*;
@Controller
public class UserController {
	@Autowired
	UserService service;
	@GetMapping("/")
	public String home() {
		System.out.println("Home is working");
		return "home.html";
		
	}
	@GetMapping("/logout")
	public String logout() {
		System.out.println("logout is working");
		return "redirect:/";
		
	}
//	@ModelAttribute("User")
//    public User getDefaultUser() {
//		User user = new User();
//        user.setUserType("student"); // set default user type to "student"
//
//        // Set default values for coordinator and IT team users
//        if ("coordinator".equals(user.getUserType()) || "it-team".equals(user.getUserType())) {
//            user.setUserId("co1");
//            user.setPassword("go");
//        }
//
//        return user;
//    }
	@GetMapping("/login")
	public String login() {
		System.out.println("login is working");
		return "login";
		
	}
	@PostMapping(value = "/login")
	public String login(@RequestParam String username, @RequestParam String password, @RequestParam String login_type) {
	       System.out.println(login_type);
	       System.out.println(username);
	       System.out.println(password);
	    	if (login_type.equals("Student")) {
	            User user = repository.findByUserIdAndPasswordAndUserType(username, password,login_type);
	            System.out.println(user);
	            if (user != null) {
	                return "redirect:/stu_dash";
	            }
	            
	        }
	    	else if (login_type.equals("Coordinator")) {
	            User user = repository.findByUserIdAndPasswordAndUserType(username, password,login_type);
	            System.out.println(user);
	            if (user != null) {
	                return "redirect:/co_dash";
	            }
	        }else if (login_type.equals("it-team")) {
	            User user = repository.findByUserIdAndPasswordAndUserType(username, password,login_type);
	            System.out.println(user);
	            if (user != null) {
	            	
	                return "redirect:/it_dash";
	            }
	        }
	        return "redirect:/";
	    }
	@GetMapping("/signup")
	public String signup() {
		System.out.println("signup is working");
		return "signup.html";
		
	}
	@GetMapping("/co_dash")
	public String co_dash() {
		System.out.println("co_dash is working");
		return "co_dash.html";
		
	}
//	@Autowired
//	postallotRepository postallotRepository;
	@GetMapping("/it_dash")
	public String it_dash(Model model) {
		 List<postallot> students = postallotRepository.findAll();
	        model.addAttribute("students", students);
	        System.out.println(students);
		return "it_dash.html";
		
	}
	@GetMapping("/stu_dash")
	public String stu_dash() {
		System.out.println("stu_dash is working");
		return "stu_dash.html";
		
	}
	
	@GetMapping("/reg5_1")
	public String reg5_1() {
		System.out.println("reg5_1 is working");
		return "reg5_1.html";
		
	}
	@GetMapping("/reg5_2")
	public String reg5_2() {
		System.out.println("reg5_2 is working");
		return "reg5_2.html";
		
	}
	@GetMapping("/reg5_3")
	public String reg5_3() {
		System.out.println("reg5_3 is working");
		return "reg5_3.html";
		
	}
	@GetMapping("/stu_query")
	public String stu_query() {
		System.out.println("query is working");
		return "query.html";
		
	}
	@Autowired
	UserRepository repository;
	@RequestMapping(value = "/addUser")
	public String addUser(User user) {
		System.out.println(user);
		repository.save(user);
		return "redirect:/login";
	}
	@Autowired
	StudentRepository studentRepository;
	@RequestMapping(value = "/addStudent")
	public String addStudent(student student) {
		System.out.println(student);
		studentRepository.save(student);
		return "redirect:/stu_dash";
	}
	

    @GetMapping("/res5_1")
    public String getAllStudents(Model model) {
        List<student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "res5_1.html"; // the name of the view file
    }
	@Autowired
	studentreg2Repository studentreg2Repository;
	@RequestMapping(value = "/addreg2")
	public String addreg2(studentreg2 studentreg2) {
		System.out.println(studentreg2);
		studentreg2Repository.save(studentreg2);
		return "redirect:/stu_dash";
	}
	
	@GetMapping("/res5_2")
    public String getAllStudentreg2s(Model model) {
        List<studentreg2> students = studentreg2Repository.findAll();
        model.addAttribute("students", students);
        System.out.println(students);
        return "res5_2.html"; // the name of the view file
    }
	@Autowired
	studentreg2Service s2serService;
	
	@GetMapping("/allocate-electives2")
    public String allocateElectives() {
		s2serService.allocateElectives();
        return "redirect:/co_dash"; // assuming you have a "/students" endpoint that displays a list of students
    }
	@Autowired(required = true)
	studentreg3Service studentreg3Service;
	@GetMapping("/allocate-electives3")
    public String allocateElectives2() {
		studentreg3Service.allocateElectives2();
        return "redirect:/co_dash"; // assuming you have a "/students" endpoint that displays a list of students
    }
	@Autowired
	postallotRepository postallotRepository;
	@GetMapping("/see_result")
	public String result(Model model) {
		 List<postallot> students = postallotRepository.findAll();
	        model.addAttribute("students", students);
	        System.out.println(students);
	        return "result.html";
	}
	@GetMapping("/stu_result1")
	public String result1(Model model) {
		 List<postallot> students = postallotRepository.findAll();
	        model.addAttribute("students", students);
	        System.out.println(students);
	        return "stu_result.html";
	}
	
	@GetMapping("/del")
	public String del() {
		  postallotRepository.deleteAll();
	        System.out.println("Delete is working");
	        return "co_dash.html";
	}
	
	@Autowired
	studentreg3Repository studentreg3Repository;
	@RequestMapping(value = "/addreg3")
	public String addreg2(studentreg3 studentreg3) {
		System.out.println(studentreg3);
		studentreg3Repository.save(studentreg3);
		return "redirect:/stu_dash";
	}
	@GetMapping("/res5_3")
    public String getAllStudentreg3s(Model model) {
        List<studentreg3> students = studentreg3Repository.findAll();
        model.addAttribute("students", students);
        System.out.println(students);
        return "res5_3.html"; // the name of the view file
    }
	@Autowired
	queryRepository queryRepository;
	@RequestMapping(value = "/addquery")
	public String addquery(query queryy) {
		System.out.println(queryy);
		queryRepository.save(queryy);
		return "redirect:/stu_dash";
	}
	@RequestMapping(value = "/ans_query")
	public String answer(Model model) {
		List<query> students = queryRepository.findAll();
        model.addAttribute("students", students);
        System.out.println(students);
		return "answer.html";
	}
	@PostMapping("/reply")
	@Transactional
	public String addanswer(@RequestParam(name = "id", required = false) Integer id, 
            @RequestParam(name = "answer") String answer) {
		System.out.println(id);
		System.out.println(answer);
		queryRepository.updateAnswerById(id,answer);
		return "redirect:/ans_query";
	}

//    @GetMapping(value = "/error")
//    public String error() {
//       
//        return "error";
//    }
	

}
