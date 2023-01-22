package com.hr.services;

import com.hr.error.RecordNotFoundException;
import com.hr.model.Employee;
import com.hr.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {

@Autowired
   private EmployeeRepository employeeRepository;



//used to get All Employee
public List<Employee> getAllEmployee(){

    return     employeeRepository.findAll();}

    public Employee getEmployeeById(long id){

        return     employeeRepository.findById(id).orElseThrow(()-> new RecordNotFoundException("This Employee Not Found :-"+ id));}

     public  List<Employee> FindByFirstName(String firstName){

    return  employeeRepository.findByFirstName(firstName);
     }

// public Employee findSearch(String firstName,String lastName){
//
//    return employeeRepository.searchEmp(firstName,lastName);
// }

//Add Employee Use Post Method

    public  void addEmployee(Employee employee){
    employeeRepository.save(employee);}

    public  void updateEmployee(Employee employee){
        employeeRepository.save(employee);}

    public void deleteEmployee(long id){
 employeeRepository.deleteById(id);

    }


    public List<Employee> getDeptEmps(long deptId){
    return employeeRepository.findDeptById(deptId);
    }



}
