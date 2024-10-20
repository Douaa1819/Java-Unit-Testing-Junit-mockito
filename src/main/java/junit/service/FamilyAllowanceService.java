package org.employeemanagement.service.interfaces;

import org.employeemanagement.entities.Employee;
import org.employeemanagement.entities.FamilyAllowance;

public interface FamilyAllowanceService {
    FamilyAllowance calculateAndSaveAllowance(int numberOfChildren, double salary, Employee employee, String month) ;
    FamilyAllowance getAllowanceByEmployeeId(Long employeeId);
}
