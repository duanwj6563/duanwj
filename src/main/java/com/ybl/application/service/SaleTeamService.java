package com.ybl.application.service;

import com.ybl.domain.secondary.model.SmisTeamEntity;

import java.util.List;

/**
 * 销售团队接口
 * Created by duanwj on 2018/4/20 0020 11:12
 */
public interface SaleTeamService {
    //根据父类查询出下级信息
    List<SmisTeamEntity> getInfoByParentId(String parentId);
}
