package dao;

import model.Employee;

/**
 * Created by hoangtd on 12/23/2016.
 */
public interface EmployeeDAO {
    Employee get(Integer empId);

    Employee insert(Employee employee);

    Employee update(Employee employee);

    void delete(Integer empId);
}
