package com.ybl.domain.secondary.repository;

import com.ybl.domain.secondary.model.SmisTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by duanwj on 2018/4/11 0011 10:28
 */
public interface SmisTeamRepository extends JpaRepository<SmisTeamEntity, Integer> {
    SmisTeamEntity findByBranchIdAndTeamId(String branchId, String teamId);
}
