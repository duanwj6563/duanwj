package com.ybl.domain.primary.repository;

import com.ybl.domain.primary.model.SaleUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by duanwj on 2018/4/11 0011 10:28
 */
public interface SaleUserRepository extends JpaRepository<SaleUser, Integer> {
    /**
     * 根据销售人员工号密码状态查询
     *
     * @param sales_id
     * @param password
     * @return
     */
    SaleUser findByUsernameAndPassword(String sales_id, String password);

    /**
     * 校验是否已经注册
     *
     * @param sales_id
     * @return
     */
    SaleUser findByUsername(String sales_id);
}
