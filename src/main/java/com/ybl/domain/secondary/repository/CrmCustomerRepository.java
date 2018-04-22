package com.ybl.domain.secondary.repository;

import com.ybl.domain.secondary.model.CrmCustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface CrmCustomerRepository extends JpaRepository<CrmCustomerEntity, Integer> {

    List<CrmCustomerEntity> findByCertiTypeAndCertiNoAndNameAndBirthdayAndGenderAndBranchNo(String certiType, String certiNo, String name, Timestamp birthday, String gender, String branchNo);

    CrmCustomerEntity findByCustomerId(String CustomerId);
}
