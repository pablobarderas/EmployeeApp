package tech.getarrays.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
