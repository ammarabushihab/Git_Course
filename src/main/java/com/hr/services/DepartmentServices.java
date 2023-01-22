package com.hr.services;

import com.hr.model.Department;
import com.hr.model.Employee;
import com.hr.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServices {


    @Autowired
    private DepartmentRepository   departmentRepository;



    public List<Department> getAllDepartment(){

        return     departmentRepository.findAll();}

    public Department getDepartmentById(long departmentId){

        return     departmentRepository.findById(departmentId).orElseThrow(null);}



// public Employee findSearch(String firstName,String lastName){
//
//    return employeeRepository.searchEmp(firstName,lastName);
// }

//Add Employee Use Post Method

    public  void addDepartment(Department department){
        departmentRepository.save(department);}

    public  void updateDepartment(Department department){
        departmentRepository.save(department);}

    public void deleteDepartment(long departmentID){
        departmentRepository.deleteById(departmentID);

    }













}
