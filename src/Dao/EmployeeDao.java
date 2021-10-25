package Dao;

import model.Employee;
import model.Enums.SalaryRange;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao extends AccessDao {


    public EmployeeDao(Connection connection) {
        super(connection);
    }

    public List<Employee> getAll() throws SQLException, ClassNotFoundException {
        if (getConnection() != null) {
            PreparedStatement statement = getConnection().prepareStatement("select * from employee");
            ResultSet resultSet = statement.executeQuery();
            List<Employee> employeeList = new ArrayList<>();
            if (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String fullName = resultSet.getString("FullName");
                String personalCode = resultSet.getString("PersonalCode");
                String salaryRange = resultSet.getString("SalaryRange");
                String inputYear = resultSet.getString("InputYear");
                Employee employee = new Employee(id, fullName, personalCode, SalaryRange.valueOf(salaryRange), inputYear);
                employee.setId(id);
                employeeList.add(employee);
            }
            return employeeList;
        }
        return null;
    }
}
