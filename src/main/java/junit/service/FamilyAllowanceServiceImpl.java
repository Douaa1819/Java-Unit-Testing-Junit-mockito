package org.employeemanagement.service;

import org.employeemanagement.entities.Employee;
import org.employeemanagement.entities.FamilyAllowance;
import org.employeemanagement.repository.interfaces.FamilyAllowanceRepository;
import org.employeemanagement.service.interfaces.FamilyAllowanceService;

public class FamilyAllowanceServiceImpl implements FamilyAllowanceService {

    private FamilyAllowanceRepository familyAllowanceRepository;

    public FamilyAllowanceServiceImpl(FamilyAllowanceRepository familyAllowanceRepository) {
        this.familyAllowanceRepository = familyAllowanceRepository;
    }

    @Override
    public FamilyAllowance calculateAndSaveAllowance(int numberOfChildren, double salary, Employee employee, String month) {
        double allowanceAmount = calculateAmount(numberOfChildren, salary);
        double totalAmount = allowanceAmount + salary;
        FamilyAllowance familyAllowance = new FamilyAllowance(employee, numberOfChildren, totalAmount, month);
        return familyAllowanceRepository.save(familyAllowance);
    }

    private double calculateAmount(int numberOfChildren, double salary) {
        double amount = 0;

        if (salary < 6000) {
            if (numberOfChildren <= 3) {
                amount = numberOfChildren * 300;

            } else if (numberOfChildren <= 6) {
                amount = (3 * 300) + ((numberOfChildren - 3) * 150);
            }

        } else if (salary > 8000) {
            if (numberOfChildren <= 3) {
                amount = numberOfChildren * 200;
            } else if (numberOfChildren <= 6) {
                amount = (3 * 200) + ((numberOfChildren - 3) * 110);
            }
        }
        return amount;
    }

    @Override
    public FamilyAllowance getAllowanceByEmployeeId(Long employeeId) {
        return familyAllowanceRepository.findByEmployeeId(employeeId);
    }
}
