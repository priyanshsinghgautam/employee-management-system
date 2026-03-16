package service;

import model.Employee;

public interface EmployeeService {
    void addEmployee(Employee emp);
    void viewEmployees();
    void searchEmployee(int id);
}
