package org.employeemanagement.repository.interfaces;

import org.employeemanagement.entities.FamilyAllowance;

public interface FamilyAllowanceRepository {
    FamilyAllowance save(FamilyAllowance familyAllowance);
    FamilyAllowance findById(Long id);
    FamilyAllowance findByEmployeeId(Long employeeId);
}
