package com.ybl.domain.secondary.repository;

import com.ybl.domain.secondary.model.CbsContractlifeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by duanwj on 2018/4/19 0019 16:12
 */
public interface CbsContractlifeRepository extends JpaRepository<CbsContractlifeEntity, Integer> {
    /**
     * 查询年保单
     *
     * @param agentId
     * @param rtnDate
     * @return
     */
    @Query("select  cb from CbsContractlifeEntity cb where cb.agentId=?1 and substring(cb.rtnDate,1,4)=?2 ")
    List<CbsContractlifeEntity> year(String agentId, String rtnDate);

    /**
     * 查询月保单
     *
     * @param agentId
     * @param rtnDate
     * @return
     */
    @Query("select  cb from CbsContractlifeEntity cb where cb.agentId=?1 and substring(cb.rtnDate,1,7)=?2 ")
    List<CbsContractlifeEntity> month(String agentId, String rtnDate);
}
