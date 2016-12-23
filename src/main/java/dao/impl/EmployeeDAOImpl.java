package dao.impl;

import dao.EmployeeDAO;
import model.Employee;

import javax.persistence.EntityManager;

/**
 * Created by hoangtd on 12/23/2016.
 */
public class EmployeeDAOImpl implements EmployeeDAO {
    public Employee get(Integer empId) {
        EntityManager entityManager = null;
        Employee employee = null;
        try {
            entityManager = EntityManagerUtil.getEntityManager();
            employee = (Employee) entityManager.find(Employee.class, empId);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }


    public Employee insert(Employee employee) {

        EntityManager entityManager = null;

        try {

            entityManager = EntityManagerUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            return employee;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public Employee update(Employee employee) {

        EntityManager entityManager = null;

        try {
            entityManager = EntityManagerUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(employee);
            entityManager.getTransaction().commit();
            return employee;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public void delete(Integer empId) {

        EntityManager entityManager = null;
        try {

            entityManager = EntityManagerUtil.getEntityManager();
            entityManager.getTransaction().begin();
            Employee emp = (Employee) entityManager.find(Employee.class, empId);
            entityManager.remove(emp);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}