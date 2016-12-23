package dao.impl;

import dao.EmployeeDAO;
import model.Employee;

/**
 * Created by hoangtd on 12/23/2016.
 */
public class EmployeeService {
    public static void main(String[] args) {

        EmployeeDAO empDAO = new EmployeeDAOImpl();

        Employee createEmp1 = new Employee(6, "Sachin","R&D");
        empDAO.insert(createEmp1);//Create

    }
}
