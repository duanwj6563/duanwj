package com.ybl.domain.secondary.repository;

import com.ybl.domain.secondary.model.SmisSalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by duanwj on 2018/4/11 0011 10:28
 */
public interface SmisSalesRepository extends JpaRepository<SmisSalesEntity, Integer> {
    SmisSalesEntity findBySalesIdAndSalesStatus(String salesId, String salesStatus);

    SmisSalesEntity findBySalesId(String salesId);

    /**
     * 年查询推荐人
     *
     * @param recommendId
     * @param probationDate
     * @return
     */
    @Query("select sm from SmisSalesEntity sm where sm.recommendId=?1 and substring(sm.probationDate,1,4)=?2")
    List<SmisSalesEntity> year(String recommendId, String probationDate);

    /**
     * 月查询推荐人
     *
     * @param recommendId
     * @param probationDate
     * @return
     */
    @Query("select sm from SmisSalesEntity sm where sm.recommendId=?1 and substring(sm.probationDate,1,7)=?2")
    List<SmisSalesEntity> month(String recommendId, String probationDate);
}
