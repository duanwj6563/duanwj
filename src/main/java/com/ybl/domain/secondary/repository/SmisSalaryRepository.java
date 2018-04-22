package com.ybl.domain.secondary.repository;

import com.ybl.domain.secondary.model.BatPersonWageReportEntity;
import com.ybl.domain.secondary.model.BatPersonWageReportEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by duanwj on 2018/4/17 0017 19:24
 */
public interface SmisSalaryRepository extends JpaRepository<BatPersonWageReportEntity, BatPersonWageReportEntityPK> {
    /**
     * 根据月份查询薪资
     *
     * @param username
     * @param date
     * @param type
     * @return
     */
    @Query("select bw from BatPersonWageReportEntity bw where bw.personNo=?1 and substring(bw.calcDate,1,7)=?2 and bw.calcType=?3")
    BatPersonWageReportEntity findByPersonNoAndCalcDateAndCalcType(String username, String date, String type);

}
