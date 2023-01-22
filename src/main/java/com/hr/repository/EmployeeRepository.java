package com.hr.repository;

import com.hr.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //custom Metho

//    @Query("select emp from Employee emp where emp.firstName = :firstNameBind and emp.lastName =:LastNameBind")
//    public Employee searchEmp(@Param("firstNameBind")String firstName,@Param("lastNameBind")String lastName);

    public List<Employee> findByFirstName(String firstName);


    public List<Employee> findDeptById (long departmentId);
}
