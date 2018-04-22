package com.ybl.application.service;


import com.ybl.domain.dto.SmisSalesEntityDto;
import com.ybl.domain.secondary.model.CrmCustomerContactEntity;
import com.ybl.domain.secondary.model.CrmCustomerEntity;
import com.ybl.domain.secondary.model.CrmCustomerLogEntity;

/**
 * Created by wyc on 2018/4/19
 */
public interface CrmCustomerService {

    int addCrmCustomer(CrmCustomerContactEntity crmCustomerContactEntity, CrmCustomerEntity crmCustomerEntity, CrmCustomerLogEntity crmCustomerLogEntity, SmisSalesEntityDto smisSalesEntityDto);

}
