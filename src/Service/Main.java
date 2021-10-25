package Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        EmployeeService employeeService=new EmployeeService();
        Scanner scanner=new Scanner(System.in);
        outer:
        while (true){
            System.out.println("***welcome to company*** \n"+
                    "1:Show All Employee List\n" +
                    "2.Show Employee List on Input Year\n" +
                    "3.exit");
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("******List Employees*******");
                    employeeService.getAll();
                    break;

            }
        }

    }
    private static void showList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
