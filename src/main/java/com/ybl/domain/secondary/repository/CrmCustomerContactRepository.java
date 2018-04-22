package com.ybl.domain.secondary.repository;

import com.ybl.domain.secondary.model.CrmCustomerContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrmCustomerContactRepository extends JpaRepository<CrmCustomerContactEntity, Integer> {
}
