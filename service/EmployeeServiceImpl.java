package service;

import java.sql.*;
import model.Employee;
import util.DBConnection;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void addEmployee(Employee emp) {
        try {
            String sql = "INSERT INTO employees VALUES (?, ?, ?, ?)";

            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());

            ps.executeUpdate();
            System.out.println("Employee added successfully!");

        } catch (Exception e) {
            System.out.println("Error adding employee!");
            e.printStackTrace();
        }
    }

    @Override
    public void viewEmployees() {
        try {
            String sql = "SELECT * FROM employees";

            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            boolean found = false;
            System.out.println("\n--- Employee List ---");

            while (rs.next()) {
                found = true;
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary")
                );
            }

            if (!found) {
                System.out.println("No employees found.");
            }

        } catch (Exception e) {
            System.out.println("Error fetching employees!");
            e.printStackTrace();
        }
    }

    @Override
    public void searchEmployee(int id) {
        try {
            String sql = "SELECT * FROM employees WHERE id = ?";

            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("\nEmployee Found:");
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary")
                );
            } else {
                System.out.println("Employee not found.");
            }

        } catch (Exception e) {
            System.out.println("Error searching employee!");
            e.printStackTrace();
        }
    }
}
