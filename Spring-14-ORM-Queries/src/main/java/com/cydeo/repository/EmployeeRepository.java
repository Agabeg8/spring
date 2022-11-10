package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //Display all employee with email address ' '
    List<Employee> findByEmail(String email);

    //Display all employees with first name ' ' and last name ' ', also show all employee with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display all employees that first name is not ' '
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ' '
    List<Employee> findByLastNameStartingWith(String pattern);

    //Display all employees with salaries higher than ' '
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ' '
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    //Display all employees that has been hired between '' and ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries greater and equal to '' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();



    @Query("SELECT e FROM Employee e where e.email='amcnee1@google.es'")
    Employee getEmployeeDetail();

    @Query("select e.salary from Employee  e where e.email='amcnee1@google.es'")
    Integer getEmployeeSalary();

    @Query("select e from Employee e where e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("select e from Employee e where e.email=?1 and e.salary=?2")
    Employee getEmployeeDetail(String email, int salary);

    //Not Equal
    @Query("select e from Employee e where e.salary <> ?1 ")
    List<Employee> getEmployeeSalary(int salary);

    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1 ")
    List<Employee> getEmployeeFirstName(String pattern);

    @Query("SELECT e FROM Employee e WHERE e.salary < ?1")
    List<Employee> getEmployeeSalaryLessThan(int salary);

    @Query("SELECT e FROM Employee e WHERE e.salary > ?1")
    List<Employee> getEmployeeSalaryGreaterThan(int salary);

    @Query("SELECT e FROM Employee e WHERE e.hireDate > ?1")
    List<Employee> getEmployeeHireDateBefore(LocalDate date);

    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> getEmployeeSalaryBetween(int salary1, int salary2);

    @Query("SELECT e FROM Employee e WHERE e.email IS NULL")
    List<Employee>getEmployeeEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee>getEmployeeEmailIsNotNull();

    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee> getEmployeeSalaryOrderAsc();

    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC ")
    List<Employee> getEmployeeSalaryOrderDesc();

    @Query(value = "SELECT * FROM employees WHERE salary ?1",nativeQuery = true)
    List<Employee> readEmployeeDetailBySalary(int salary);

    @Query("SELECT e FROM Employee e WHERE e.salary = :salary")
    List<Employee> getEmployeeSalary1(@Param("salary") int salary);



}
