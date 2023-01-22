package com.hr.controller;


import com.hr.services.DepartmentServices;
import com.hr.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

@Autowired
    private DepartmentServices  departmentServices;



    @GetMapping("/department")

//@RequestMapping(method=RequestMethod.GET )   :Same Like Get MApping U have Choice witch one to use
    public List<Department> getAllDepartment(){
        return departmentServices.getAllDepartment();




//    List<Employee> emps=new ArrayList<Employee>();
//    emps.add (new Employee(1,"Ammar","Abushihab",1500.20,"Jordan"));
//    emps.add (new Employee(2,"Ahmad","Abushihab",1000.20,"Jordan"));
//    emps.add (new Employee(3,"Hani","AbuHammad",500.20,"Jordan"));
//    emps.add (new Employee(4,"sami","Abadi",800.20,"Jordan"));



    }//will access by http://localhost:8095/departmentbyid?id=1
    @GetMapping("/departmentbyid")
    public Department getEmployeeID(@RequestParam long departmentId) {
        return departmentServices.getDepartmentById(departmentId);}
    //will access by http://localhost:8095/employeebyname?firstName=Hani



//    @GetMapping("/employee/")
//    public Employee getBySearch(@RequestParam String firstName,@RequestParam String lastName) {
//        return employeeServices.findSearch(firstName,lastName);}

    @PostMapping("/department")
    public  String addByDepartment(@RequestBody Department department){
        departmentServices.addDepartment(department);
        return "Saved Successfully";
    }
    @PutMapping("/department")
    public  String updateDepartment(@RequestBody Department department){
        departmentServices.updateDepartment(department);
        return "Update Successfully";
    }

    @DeleteMapping("/department")
    public String deleteDepartment(@RequestParam long departmentId){
        departmentServices.deleteDepartment(departmentId);
        return "Delete Successfully";
    }


}





