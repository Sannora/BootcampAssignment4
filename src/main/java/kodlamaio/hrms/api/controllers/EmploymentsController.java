package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmploymentService;
import kodlamaio.hrms.entities.concretes.Employment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/employments")
public class EmploymentsController {

    EmploymentService employmentService;

    @Autowired
    public EmploymentsController(EmploymentService employmentService) {
        this.employmentService = employmentService;
    }

    @GetMapping("getEmployments")
    public List<Employment> getAll(){
        return this.employmentService.getAll();
    }

}
