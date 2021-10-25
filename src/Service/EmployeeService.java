package Service;

import Dao.EmployeeDao;
import model.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public EmployeeService() {
    }


    public List<Employee> getAll() throws SQLException, ClassNotFoundException {
        List<Employee> employeeList = employeeDao.getAll();
////        for (Employee employee:employeeList){
////            System.out.println(employee);
//        }
        return employeeList;
    }
}
