package com.ybl.domain.secondary.repository;

import com.ybl.domain.secondary.model.SysBranchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by duanwj on 2018/4/11 0011 10:28
 */
public interface SysBranchRepository extends JpaRepository<SysBranchEntity, Integer> {

    SysBranchEntity findByBranchId(String branchId);
}
