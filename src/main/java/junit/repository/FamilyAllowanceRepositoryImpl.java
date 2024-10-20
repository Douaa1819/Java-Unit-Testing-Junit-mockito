package org.employeemanagement.repository;

import jakarta.persistence.TypedQuery;
import org.employeemanagement.entities.FamilyAllowance;
import org.employeemanagement.exception.DatabaseOperationException;
import org.employeemanagement.repository.interfaces.FamilyAllowanceRepository;
import org.employeemanagement.utils.JpaUtil;

import jakarta.persistence.EntityManager;


public class FamilyAllowanceRepositoryImpl implements FamilyAllowanceRepository {

    @Override
    public FamilyAllowance save(FamilyAllowance familyAllowance) {
        EntityManager entityManager = null;
        try {
            entityManager = JpaUtil.getInstance().getEntityManagerFactory().createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(familyAllowance);
            entityManager.getTransaction().commit();
            return familyAllowance;
        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public FamilyAllowance findById(Long id) {
        EntityManager entityManager = null;
        FamilyAllowance familyAllowance = null;
        try {
            entityManager = JpaUtil.getInstance().getEntityManagerFactory().createEntityManager();
            familyAllowance = entityManager.find(FamilyAllowance.class, id);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return familyAllowance;
    }


    @Override
    public FamilyAllowance findByEmployeeId(Long employeeId) {
        EntityManager entityManager = null;
        FamilyAllowance familyAllowance = null;
        try {
            entityManager = JpaUtil.getInstance().getEntityManagerFactory().createEntityManager();
            TypedQuery<FamilyAllowance> query = entityManager.createQuery(
                    "SELECT fa FROM FamilyAllowance fa WHERE fa.employee.id = :employeeId", FamilyAllowance.class);
            query.setParameter("employeeId", employeeId);
            familyAllowance = query.getSingleResult();

            entityManager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("No family allowance found for employee ID: " + employeeId);
            e.printStackTrace();
            if (entityManager != null) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        return familyAllowance;
    }


}
