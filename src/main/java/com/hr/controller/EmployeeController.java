package com.hr.controller;


import com.hr.services.EmployeeServices;
import com.hr.model.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Value("${hr.file.path}")
    String filepath;

    @Value("${spring.application.name}")
    String appName;

    @Autowired
    private EmployeeServices employeeServices;

@GetMapping("/employee")

//@RequestMapping(method=RequestMethod.GET )   :Same Like Get MApping U have Choice witch one to use
public List<Employee> getAllEmployees() {
    System.out.println("Application Name Is"+appName+"    File Path Is "+filepath);


    return employeeServices.getAllEmployee();


//    List<Employee> emps=new ArrayList<Employee>();
//    emps.add (new Employee(1,"Ammar","Abushihab",1500.20,"Jordan"));
//    emps.add (new Employee(2,"Ahmad","Abushihab",1000.20,"Jordan"));
//    emps.add (new Employee(3,"Hani","AbuHammad",500.20,"Jordan"));
//    emps.add (new Employee(4,"sami","Abadi",800.20,"Jordan"));
}

    @GetMapping("/departments/{deptId}/employee")
    public List<Employee> getDepartmentById(@PathVariable long deptId) {
        return employeeServices.getDeptEmps(deptId);}

//will access by http://localhost:8095/employeebyid?id=1
    @GetMapping("/employeebyid")
    public Employee getEmployeeID(@RequestParam long id) {
        return employeeServices.getEmployeeById(id);}
//will access by http://localhost:8095/employeebyname?firstName=Hani
    @GetMapping("/employeebyname")
    public List<Employee> getEmployeeID(@RequestParam String firstName) {
        return employeeServices.FindByFirstName(firstName);}


//    @GetMapping("/employee/")
//    public Employee getBySearch(@RequestParam String firstName,@RequestParam String lastName) {
//        return employeeServices.findSearch(firstName,lastName);}

    @PostMapping("/employee")
    public ResponseEntity<Employee> addByEmployee(@Valid  @RequestBody Employee employee){
      employeeServices.addEmployee(employee);

      return new ResponseEntity<Employee>(employee, HttpStatus.OK);
}
    @PutMapping("/employee")
    public  ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee employee){
        employeeServices.updateEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/employee")
    public String deleteEmployee(@RequestParam long id){
    employeeServices.deleteEmployee(id);
    return "Delete Successfully";
    }
}
