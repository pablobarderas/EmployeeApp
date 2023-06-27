package tech.getarrays.employeemanager.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // ADD NEW EMPLOYEE
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    // LIST ALL EMPLOYEES
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    // FIND EMPLOYEE BY ID
    public Optional<Employee> findEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // UPDATE EMPLOYEE
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // DELETE EMPLOYEE
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
